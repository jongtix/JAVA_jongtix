package p03.singletone;

public class SingleTone2 {
	// 필드
	private static SingleTone2 instance;
	private SingleTone2() {}
	public static SingleTone2 getInstance() {
		if (instance != null) {
			instance = new SingleTone2();
		}
		return instance;
	}
}
