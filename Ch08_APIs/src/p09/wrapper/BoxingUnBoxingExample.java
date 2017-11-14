package p09.wrapper;
/**
 * 
 * */
public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// Boxing - 기본 데이터 타입을 클래스화 시킴
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		// UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// 자동 boxing
		Integer obj = 100; // int -> Integer로 자동 변환
		System.out.println("value : " + obj.intValue());
		// 자동 unBoxing
		int value = obj; // Integer -> int로 자동 변환
		// 연산 중 자동 unBoxing
		int result = obj + 100;
		// 값 변환 숫자형 문자열 -> 숫자로 변환
		int value4 = Integer.parseInt("10");
		double value5 = Double.parseDouble("3.14");
		boolean value6 = Boolean.parseBoolean("ture");
		String value7 = String.valueOf(value6);
	}
}
