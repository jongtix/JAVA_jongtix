package p05.polmorph.params;
/**
 * 상속관계에서 부모객체에서 선언된 메소드가 자식객체에서 재정의 되면
 * 무조건 자식 메소드가 호출됨(부모 타입으로 바뀌어도 자식 메소드가 호출)
 * - 매개변수의 다형성
 * - 메소드의 매개변수로 최상위 객체를 선언하면 상속받은 하위의 객체들이 매개변수로 대입 가능.
 * */
public class DriverExample {
	public static void main(String[] args) {
		// 객체 생성
		Driver driver = new Driver();
		// Vehicle을 상속 받은 자식 객체들
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 매개변수로 Vehicle객체 대신 Bus객체를 대입.
		driver.drive(taxi); // 매개변수로 Taxi객체를 대입.
	}
}
