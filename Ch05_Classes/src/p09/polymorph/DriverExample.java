package p09.polymorph;

public class DriverExample {
	public static void main(String[] args) {
		// 객체 생성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 매개 변수의 다형성
		// 인터패이스로 대입되면서 자동형변환 Promotion
		driver.drive(bus); // Vehicle 인터패이스 대신 Bus구현체가 대입
		driver.drive(taxi);
		
		// Vehicle 인터패이스에 버스 구현체를 대입
		Vehicle vehicle = new Bus();
		vehicle.run(); // Bus에서 재정의 된 메소드 호출
//		vehicle.checkFare(); // 오류발생 - 인터패이스에는 없는 메소드 사용 불가.
		Bus bus2 = (Bus) vehicle; // 강제형변환 Casting
		bus2.run();
		bus2.checkFare(); // Bus 타입으로 형변환되어서 추가된 메소드인 checkFare() 사용 가능.
	}
}
