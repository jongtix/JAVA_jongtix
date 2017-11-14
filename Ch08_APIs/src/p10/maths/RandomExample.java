package p10.maths;

import java.util.Arrays;
import java.util.Random;

/**
 * Random 클래스
 * - Random() {}
 * 		실행할 때마다 무작위로 난수 발생
 * - Random(seed) {}
 * 		처음 생성된 무작위 난수가 고정, 다시 실행해도 처음 발생한 난수를 그대로 보여줌.
 * */
public class RandomExample {
	public static void main(String[] args) {
		// 선택번호
		int [] selectNumber = new int[6];
		Random random = new Random();
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
		}
//		for (int i : selectNumber) {
//			i = random.nextInt(45) + 1;
//		}
		System.out.print("선택번호 : ");
		for (int i : selectNumber) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// 당첨번호(자동발번)
		int [] winNumber = new int[6];
		random = new Random();
		System.out.print("당첨번호 : ");
		for (int i = 0; i < winNumber.length; i++) {
			winNumber[i] = random.nextInt(45) + 1;
			System.out.print(winNumber[i] + "\t");
		}
		System.out.println();
		
		// 당첨여부확인
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);
		boolean result = Arrays.equals(selectNumber, winNumber); // 1 차원 배열 요소들의 값이 기본데이터 타입이므로 값을 비교
		System.out.print("당첨여부 : ");
		if (result) {
			System.out.println("1 등 당첨");
		} else {
			System.out.println("꽝");
		}
	}
}
