package p01.operations;
/**
 * 연산자
 * - 연산자에는 우선순위가 존재함.
 * - ()연산은 사칙연산보다 우선순위가 높다.
 */
public class OperExample1 {
	public static void main(String[] args) {
		int i = 5; //int타입의 변수 선언과 동시에 리터럴값 대입
		int j = 3;
		
		//사칙연산 x, /, +, -  <= 사칙연산보다 우선순위가 높은 연산 ()연산
		//문자열 + (사칙연산괄과) <= expression
		System.out.println("i x j = " + (i * j)); //곱하기 연산
		System.out.println("i / j = " + (i / j)); //나누기 연산
		System.out.println("i + j = " + (i + j)); //더하기 연산
		System.out.println("i - j = " + (i - j)); //빼기 연산
	}
}
