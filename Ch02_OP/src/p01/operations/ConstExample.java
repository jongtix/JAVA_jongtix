package p01.operations;
/**
 * 변수와 상수
 * - 변수는 메모리 공간의 값이 계속 바뀔 수 있는 속성,
 * 	 상수는 메모리 공간의 값이 한 번 초기화 이후 계속 바뀌지 않는 속성
 * - 상수를 만드는 법
 * 	 final 타입 변수명 = 값; //기존 변수선언과 비슷하지만 앞부분에 final을 선언하면 상수가 됨
 * - 상수는 변수와 구별하기 위해 주로 대문자로 표기함
 */
public class ConstExample {
	public static void main(String[] args) {
		int result = 0; //int타입의 변수 선언 후 값(메모리 공간)0을 대입
		result += 5; //result라는 변수(메모리공간)의 값을 0 -> 5로 바꿈
		System.out.println("result = " + result);
		final double PI = 3.14d; //double타입의 리터럴 3.14를 PI라는 상수에 대입
		
//		PI += 5; //상수는 한 번 초기화하면 더이상 값을 바꿀 수 없는 변수
		
		System.out.println("PI = " + PI);
	}
}
