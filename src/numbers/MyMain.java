package numbers;

public class MyMain {
	public static void main(String[] args) {
//		기본 데이터 타입에 관련된 클래스 타입이 있다.
//		클래스 타입의 속성과 메소드를 사용하기 위해 존재한다.
//		문자열과 수 변환에 자주 사용된다.
//		AutoBoxing, UnBoxing으로 기본 데이터 타입과 클래스타입이 자동 변환된다.
		
		int i = 3;
		short s = 1;
		long l = 234234L;
		byte b = 12;
		
		float f = 3.14F;
		double d = 3.8213124;
		
		Integer ic = new Integer(3);
		Short sc = new Short((short) 1);
		Long lc = new Long(234234);
		byte bc = new Byte((byte) 12);
		
		Float fc = new Float(3.14F);
		Double dc = new Double(3.24152);
		
		System.out.println(ic);
		
		print(3); // Autoboxing
	}
	
	public static void print(Integer i) {
		System.out.println(i + 10); // UnBoxing
	}
}
