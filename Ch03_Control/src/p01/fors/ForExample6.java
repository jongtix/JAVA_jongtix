package p01.fors;

import java.util.Random;

/**
 * for
 */
public class ForExample6 {
	public static void main(String[] args) {
		// 두 개의 주사위를 10 번 던져서 두 개의 합을 구하는 p/g
		// random()메소드를 이용한 난수 발생
		for (int i = 0; i < 10; i++) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			// 두 수의 합이 6일때만 출력되도록 수정
			if ((num1 + num2) == 6) {
				System.out.println("num1 = " + num1);
				System.out.println("num2 = " + num2);
				System.out.println("num1 + num2 = " + (num1 + num2));
			}
		}

//		for (int i = 0; i < 10; i++) {
//			Random num1 = new Random()
//		}
	}
}
