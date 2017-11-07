package p09.interfaces;

public class RemoteControllerExample {
	public static void main(String[] args) {
		// 객체 생성
		// 인터패이스를 구현한 클래스의 객체를 생성할 수 있다.
//		RemoteControl rc0 = new RemoteControl(); // 인터패이스도 자신의 객체를 생성할 수 없다.
		RemoteControl rc = new Television();
		RemoteControl rc1 = new Audio();
		
		rc.turnOn(); // 메소드 호출, 메소드 선언부의 호출
		rc.setVolume(20); // setVolume(값);
		rc.setMute(true);
		rc.turnOff();
		RemoteControl.changeBattery();
		
		rc1.turnOn();
		rc1.setVolume(-5);
		rc1.setMute(true);
		rc1.turnOff();
	}
}
