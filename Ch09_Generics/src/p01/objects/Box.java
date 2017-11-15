package p01.objects;

public class Box {
	// 필드
	private Object object; // 모든 타입이 대입 가능한 Object 타입의 필드
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}

// Apple 타입의 클래스
class Apple {
	
}