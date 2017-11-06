package p05.polmorph.fields;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞쪽 왼쪽 타이어", 6); // 운전석
	Tire frontRightTire = new Tire("앞쪽 오른쪽 타이어", 2);
	Tire rearLeftTire = new Tire("뒷쪽 왼쪽 타이어", 3);
	Tire rearRightTire = new Tire("뒷쪽 오른쪽 타이어", 4);
	
	// 메소드
	int run() {
		System.out.println();
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (rearLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (rearRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	private void stop() {
		System.out.println("자동차 멈춤");
	}
}
