package p05.polmorph.fields_arrays;

public class Car {
	// 필드
	Tire[] tires = { new Tire("앞쪽 왼쪽 타이어", 6), // 운전석
					 new Tire("앞쪽 오른쪽 타이어", 2),
					 new Tire("뒷쪽 왼쪽 타이어", 3),
					 new Tire("뒷쪽 오른쪽 타이어", 4) };
	
	// 메소드
	int run() {
		System.out.println();
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}
	
	private void stop() {
		System.out.println("자동차 멈춤");
	}
}
