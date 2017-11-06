package p05.polmorph.fields;

public class Tire {
	// 필드
	public int maxRotation; // 타이어 수명
	public int accumulateRotation; // 누적횟수
	public String location; // 타이어 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {
		++accumulateRotation; // 누적회전수 증가.
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Tire의 남은 수명" + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 교체 필요");
			return false;
		}
	}
}
