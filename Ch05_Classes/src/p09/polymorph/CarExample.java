package p09.polymorph;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		myCar.run();
		
		// myCar의 필드는 Tire 타입의 인터패이스 구현체를 대입(필드의 다형성) 
		myCar.frontLeftTire = new KumhoTire(); // 타이어 교체
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
	}
}
