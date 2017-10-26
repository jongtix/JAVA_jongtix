package p01.helloTest;
/**
 * 
 * java의 모든 클래스는 최상위클래스인 Object클래스로부터
 * 상속(Object클래스의 속성과 메소드를 물려받는 것)을 받아 생성된다.
 * 
 * -생성자
 * : 클래스명과 동일한 이름을 가진 메소드이다. 리턴부분이 없음.
 * : 생성자의 역할: 객체 생성시 초기화를 위한 용도.
 * : 클래스에서 매개변수가 없는 생성자(default 생성자)를 쓰지 않으면,
 *   컴파일시 jvm이 default생성자를 주입하여 컴파일함.
 *   
 **/
public class HelloTest2 /*extends Object*/ {
	
	//생성자
//	HelloTest2() {
//		
//	}
	
	//매소드
	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
	}
}
