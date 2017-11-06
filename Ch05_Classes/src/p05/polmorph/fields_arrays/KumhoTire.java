package p05.polmorph.fields_arrays;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 자식 클래스에서 메소드 재정의
	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + " HankookTire 남은수명 : " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 교체 ***");
			return false;
		}
	}
}
