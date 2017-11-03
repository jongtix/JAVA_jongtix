package p03.singletone;
/**
 * Singletone 방식
 * - 객체의 생성을 막고 하나의 instance만 생성하여 필요시 사용하고 되돌려주는 방식의 클래스생성 방식
 * */
public class SingleTone {
	private static SingleTone instance = new SingleTone();
	private SingleTone() {} // 생성자는 private로 접근제한이 되어있어서 외부에서 접근 불가.
	
	static SingleTone getInstance() {
		return instance;
	}
}
