package p09.wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		// 값이 -128~127까지의 비교 vs -128~127을 초과한 값의 비교
		
		// 범위 초과 => 객체로 취급
		System.out.println("[-128~127 초과값인 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("== 결과 : " + (obj1 == obj2));
		System.out.println("equals() 결과 : " + obj1.equals(obj2));
		System.out.println("언박싱 후 결과 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println();
		
		// 범위 내 => int(기본 데이터 타입) 취급
		System.out.println("[-128~127값 범위 내인 경우]");
		Integer obj3 = 120;
		Integer obj4 = 120;
		System.out.println("== 결과 : " + (obj3 == obj4));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
		System.out.println("언박싱 후 결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println();
	}
}
