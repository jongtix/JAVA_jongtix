package p01.operations;

/**
 * & |, && ||
 * - or 연산
 * 		|: 왼쪽 피연산자의 값이 true더라도 오른쪽 피연산자의 값을 연산 후 |연산을 함.
 *		||: 왼쪽 피연산자의 값이 true이면 or연산자의 특성상 오른쪽 피연산자의 true/false여부와 상관없이 true이므로
 * 		 	연산을 중단하고 다음 명령을 실행함.
 *
 * - and 연산
 */
public class AndOrOperExample1 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;

		if (++num1 > 0 | ++num2 > 0)
			System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		num1 = 0;
		num2 = 0;

		if (++num1 > 0 || ++num2 > 0)
			System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		int num3 = 0, num4 = 0;
		if (++num3 < 1 & ++num4 < 1)
			System.out.println("num3가 1보다 작고 num4가 1보다 작습니다.");
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		
		num3 = 0;
		num4 = 0;
		
		if (++num3 < 1 && ++num4 < 1)
			System.out.println("num3이 1보다 작고 num4가 1보다 작습니다.");
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);

	}
}
