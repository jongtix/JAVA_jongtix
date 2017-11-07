package p08.abstracts;

public class PhoneExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); // 부모 클래스의 메소드 호출 가능.
		smartPhone.internetSearch(); // 자식 클래스에서 추가된 메소드 호출 가능.
		smartPhone.turnOff(); // 부모 클래스의 메소드 호출 가능.
		
		Phone phone = smartPhone; // 자동형변환(자식 타입 -> 부모 타입) : Promotion
		phone.turnOn(); // 부모 클래스의 메소드 호출(자식 메소드에서 재정의 안 함)
		phone.turnOff(); // 부모 클래스의 메소드 호출
//		phone.internetSearch(); // 오류 발생
								// 부모 클래스에 없는 메소드 호출 불가.
	}
}
