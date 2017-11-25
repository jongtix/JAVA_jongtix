package typeConversion;

public class MyMain {
	public static void main(String[] args) {
		// 작은 값은 큰 타입에 할당될 수 있다.
		// int i = 3.14; 불가능
		int i = 3;
		long l = i;
		float f = i;
		double d = f;
		
		// 형변환 문법
		f = (float) d;
		short s = (short) i;
	}
}
