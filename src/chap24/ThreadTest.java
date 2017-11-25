package chap24;

public class ThreadTest extends MyThread {
	public static void main(String[] args) {
		int sum = 1;
		for (int i = 1; i <= 10; i++) {
			sum *= i;
			System.out.println(i + "곱하기 결과: " + sum);
		}
		
		System.out.println();
		System.out.println("1 ~ 10 곱하기: " + sum);
	}
}
