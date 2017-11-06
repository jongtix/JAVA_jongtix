package p05.polmorph;
/**
 * final 필드 -> 상서, 수정불가.
 * */
public class SuperSonicAirplane extends Airplane {
	public static final int NORMAL = 1; // 상수 final 필드 => 상수
	public static final int SUPERSONIC = 2;
	
	//필드
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("수퍼소닉비행");
		} else {
			super.fly(); // 자식 클래스에서 부모 메소드 호출 : super.메소드();			
		}
	}
}
