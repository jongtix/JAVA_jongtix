package p01.tryCatchFinally;
/**
 * try-catch-finally
 * - 실행할 명령문은 try {}에 기술
 * - 예외 처리는 catch() {}에 기술
 * - finally {} 에는 p/g 종료시 반드시 처리해야하는 명령문 기술
 * - finally {}에 명령문을 기술하면 p/g이 정상종료되거나 예외 발생하여 비정상 종료가 되어도 반드시 실행.
 * */
public class FinallyExample {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException e) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true); // 비정상 처리
		method(false); // 정상 처리
		
	}
}
