package p01.tryCatchFinally;

public class ArithExceptionExample {
	public static void main(String[] args) {
		int num = 100, result = 0;
		for (int i = 0; i < 10; i++) {
			int ran = (int) (Math.random() * 10);

			// 예외 발생을 방지.
			if (ran == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				result = num / ran;
				System.out.println("num : " + num);
				System.out.println("ran : " + ran);
				System.out.println("결과 : " + result);
			}

			// 발생된 오류를 처리
			try {
				result = num / ran;
				System.out.println("num : " + num);
				System.out.println("ran : " + ran);
				System.out.println("결과 : " + result);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println(ran);
				System.out.println("오류 발생");
			}
		}
	}
}
