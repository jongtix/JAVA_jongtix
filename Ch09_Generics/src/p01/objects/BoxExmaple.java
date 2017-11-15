package p01.objects;
/**
 * 범용적 프로그램은 다용도로 사용하는 장점
 * - Casting이 일어나므로 실행 속도가 떨어짐
 * - 작업의 일관성이 떨어짐
 * */
public class BoxExmaple {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get(); // Object 타입으로 리턴된 객체를 String 타입으로 casting해야하는 불편함이 발생
		System.out.println(name);
		
		box.set(new Apple());
		Apple apple = (Apple) box.get(); // Object 타입 -> Apple 타입
		System.out.println(apple);
	}
}
