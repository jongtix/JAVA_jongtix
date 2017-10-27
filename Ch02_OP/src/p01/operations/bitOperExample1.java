package p01.operations;
/**
 * 비트연산자(&, |, ^, ~) 
*/
public class bitOperExample1 {
	public static void main(String[] args) {
		int num1 = 0xFFFF0000;
		int num2 = 0xFF00FF00;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toBinaryString(num2));
		
		int result1 = num1 & num2;
		int result2 = num1 | num2;
		int result3 = num1 ^ num2;
		int result4 = ~num1;
		System.out.println(Integer.toBinaryString(result1));
		System.out.println(Integer.toBinaryString(result2));
		System.out.println(Integer.toBinaryString(result3));
		System.out.println(Integer.toBinaryString(result4));
		//printf()문 문장을 출력시 format을 사용
		//printf("%08x", 변수) => 변수의 값이 8자리의 16진수로 표시
		System.out.printf("%08x", result1);
	}
}
