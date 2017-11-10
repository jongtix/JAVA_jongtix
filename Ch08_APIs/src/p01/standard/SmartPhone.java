package p01.standard;

public class SmartPhone {
	// 필드
	private String company;
	private String os;
	
	// 생성자
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	
	// 메소드
	// Object 클래스의 toString() 메소드 재정의
	@Override
	public String toString() {
		return "제조사는 " + company + ", os는 " + os;
	}
}
