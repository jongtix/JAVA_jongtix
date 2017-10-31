package p01.whiles;

import java.util.Scanner;

/**
 * 중첩 while문
 */
public class WhileExample3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 1, j = 2; // 초기값 설정
		while (true) {
			System.out.println("구구단의 값을 입력하세요.");
			int num = s.nextInt();
			while (i <= 9) {
				while (j <= num) {
					System.out.print(j + " x " + i + " = " + i * j + "\t");
					j++;
				}
				System.out.println();
				j = 2;
				i++;
			}

			System.out.println("계속하시겠습니까?");
			char c = s.next().charAt(0);
			if (!(c == 'y' || c == 'Y')) {
				System.out.println("종료");
				break;
			}
		}
	}
}
