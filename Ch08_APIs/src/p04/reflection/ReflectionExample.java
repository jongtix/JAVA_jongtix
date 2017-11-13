package p04.reflection;
/**
 * 실행 중인 클래스의 정보(이름, 필드, 생성자, 메소드)를 얻어와서 사용하는 방식 : reflection
 * Constructor 클래스 - 생성자 정보 : getDeclaredConstructors();
 * Method 클래스 - 선언된 메소드 정보 : getDeclaredMethods();
 * Fields 클래스 - 선언된 필드 정보 : getDeclaredFields();
 * */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("p04.reflection.Car");
			System.out.println("[클래스 이름]\n" + clazz.getName());
			System.out.println();
			System.out.println("[생성자 정보]");
			Constructor [] constructors = clazz.getDeclaredConstructors(); // 생성자 정보
			for (Constructor cons : constructors) {
				System.out.print(cons.getName() + "(");
				Class[] params = cons.getParameterTypes(); // 생성자 매개변수
				printParams(params);
				System.out.println(")");
			}
			System.out.println();
			
			System.out.println("[필드 정보]");
			Field[] fields = clazz.getDeclaredFields();
			for (Field f : fields) {
				System.out.println(f.getType().getSimpleName() + " " + f.getName());
			}
			System.out.println();
			
			System.out.println("[메소드 정보]");
			Method[] methods = clazz.getDeclaredMethods();
			for (Method m : methods) {
				System.out.print(m.getName() + "(");
				Class[] params = m.getParameterTypes();
				printParams(params);
				System.out.println(")");
			}
			System.out.println();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void printParams(Class[] params) {
		for (int i = 0; i < params.length; i++) {
			System.out.print(params[i].getName());
			if (i < params.length - 1) {
				System.out.print(", ");
			}
		}
	}
}