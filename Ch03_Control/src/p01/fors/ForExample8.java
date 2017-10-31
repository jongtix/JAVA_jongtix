package p01.fors;

import java.util.Scanner;

/**
 * 중첩for문을 이용한 구구단 출력
 */
public class ForExample8 {
	public static void main(String[] args) {
		//값을 입력 받아서 구구단 출력
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			System.out.println("출력할 구구단의 단수를 입력하세요.");
			int num = keyboard.nextInt();
			for(int i = 1; i <= 9; i++) {
				for (int j = 2; j <= num; j++) {
					String str = j + " x " + i + " = " + i * j;
					System.out.printf("%-10s\t", str);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("계속하시겠습니까?");
			char c = keyboard.next().charAt(0);
			if (!(c == 'y' || c == 'Y')) {
				System.out.println("종료");
				break;
			}
		}
	}
}
