package p05.polmorph;

public class SuperSonicAirplaneExample {
	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff(); // 이륙 메소드 호출
		sa.fly(); // 비행 메소드 호출
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly(); // flyMode가 2(Supersonic)이므로 자식메소드만 호출
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly(); // flyMode가 1이므로 부모 메소드 super.fly()가 호출
		sa.land(); // 부모 메소드(자식 메소드에서 재정의 되지 않았음.)
	}
}
