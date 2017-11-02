package p01.classes;

/**
 * 사용할 클래스의 instance는 new 생성자();에 의해 만들어지고, 생성된 instance의 속성, 메소드에 접근하기 위해서는
 * 참조하는 변수.속성, 변수.메소드()로 접근함.
 */
public class StudentExample1 {
	public static void main(String[] args) {
		Student student = new Student(); // Student객체(instance) 생성 후 번지값을 student에 대입
		student.name = "홍길동"; // 생성한 instance의 속성접근 참조변수.속성 = 값;
		student.num = 10; // 생성한 instance의 속성접근 참조변수.속성 = 값;

		student.getName(); // 생성한 instance의 메소드접근 참조변수.메소드();
		student.getNum(); // 생성한 instance의 메소드접근 참조변수.메소드();
	}
}
