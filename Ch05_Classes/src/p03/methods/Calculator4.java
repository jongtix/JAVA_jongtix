package p03.methods;
/**
 * 정적메소드
 * - 클래스가 클래스로더에 의해 메모리에 적재될 때 클래스 내용을 파악하여 static키워드가 있는 필드나 메소드는 따로 떼어서 static영역으로 로드.
 * - instance 필드와 메소드는 클래스 내에 그대로 둠.
 * => static맴버는 클래스.맴버로 호출
 * 	  instance맴버는 객체를 생성 후 접근 가능
 * */
public class Calculator4 {
	String color;
	void setColor(String color) { // instance 메소드
		this.color = color;
	}
	
	//정적 메소드
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
