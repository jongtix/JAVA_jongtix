package p09.polymorph;
/**
 * drive 메소드의 매개변수로 인터패이스 vehicle이 옴.
 * */
public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		if (vehicle instanceof Bus) { // Casting 가능 여부 확인하는 메소드
			((Bus) vehicle).checkFare(); // 강제형변환 Casting
		}
	}
}
