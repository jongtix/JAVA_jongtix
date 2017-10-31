package p01.dowhile;

import java.util.Scanner;

/**
 * do-while()문
 */
public class DoExample3 {
	public static void main(String[] args) {
		int num = 0, i = 1;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력하세요.");
			System.out.println("종료하려면 \'a\'를 입력하세요.");
			num = (int) s.next().charAt(0) - '0'; //char -> int 타입 자동형변환
			if (num >= 2 && num <= 9) {
				while (i <= 9) {
					System.out.println(num + " x " + i + " = " + num * i);
					i++;
				}
			}
			i = 1;
		} while (num != 49);
		System.out.println("프로그램 종료");
	}
}
