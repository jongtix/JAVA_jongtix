package p09.interfaces;
/**
 * 인터페이스 선언
 * */
public interface RemoteControl {
	// 상수
	// 인터페이스에는 상수만 선언 가능.(변수는 선언 불가.)
	// int MAX_VOLUME = 10; => final int MAX_VOLUME = 10;과 같음(final 생략 가능)
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메소드
	// 메소드의 호출은 메소드명(선언부)의 호출
	public void turnOn(); // 호출시 turnOn();
	public void turnOff(); // 호출시 turnOff();
	public void setVolume(int volume); // 호출시 setVolume(10);
	
	// 자바 8에서 추가됨
	// 인터패이스 구현체에 영향을 미치지 않는 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 자바 8에서 추가됨
	// 정적 메소드(static 메소드)
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
