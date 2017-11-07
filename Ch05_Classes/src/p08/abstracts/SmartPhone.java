package p08.abstracts;

public class SmartPhone extends Phone {
	// 추상 클래스도 클래스이므로 반드시 생성자가 있어야함.
	// 기본 생성자가 없으면 컴파일 시 추가됨.
	// 생성 된 자식의 생성자에서 부모 생성자 호출은 super()메소드를 이용하여 호출.
	public SmartPhone(String onwer) {
		super(onwer); // super() 메소드는 반드시 첫 줄에 기술하여야 함.
	}
	
	// 메소드
	// 클래스의 상속처럼 자식 클래스에서 필요한 메소드 추가 가능.
	public void internetSearch() {
		System.out.println("인터넷 서핑...");
	}
}
