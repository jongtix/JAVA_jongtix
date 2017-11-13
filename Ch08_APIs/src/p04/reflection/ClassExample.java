package p04.reflection;
/**
 * Class 클래스 - 클래스의 정보를 담는 클래스
 * - 실행 중인 클래스의 정보를 얻어오는 방법 : reflection
 * - getClass() 메소드 : 클래스의 정보를 얻어오는 메소드
 * - forName("클래스 경로명") 메소드 : 해당 경로에 만들어져 있는 클래스를 메모리에 로딩하는 메소드  
 * - newInstance() : forName으로 로딩된 클래스를 instance화 시키는 메소드
 * 					= new Car();와 같은 기능
 * */
public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass(); // 클래스의 정보 획득
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
//			Class clazz2 = Class.forName("p04.reflection.Car"); // 중요!
			String className = clazz1.getName();
			Class clazz2 = Class.forName(className);
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
