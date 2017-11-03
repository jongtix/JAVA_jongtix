package chap02;

import java.util.Scanner;

public class p06 {
	public static void main(String[] args) {
		System.out.println("1~99 사이의 정수를 입력하시오. >>");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n / 10 == 0) { // 10의 자리가 0일 때
			if (n % 3 == 0) {
				System.out.println(n + " 박수 짝");
			}
		} else { // 10의 자리가 0이 아닐 때
			if ((n / 10) % 3 == 0) { // 10의 자리가 3의 배수
				if (n % 10 == 0 || n % 10 % 3 != 0) { // 1의 자리가 0 or 3의 배수가 아닐 때
					System.out.println(n + " 박수 짝");
				} else { // 1의 자리가 0이 아니고 3의 배수일 때
					System.out.println(n + " 박수 짝짝");
				}
			} else { // 10의 자리가 3의 배수가 아닐 때
				if (n % 10 != 0 && (n % 10) % 3 == 0) { // 1의 자리가 0이 아니고 3의 배수일 때
					System.out.println(n + " 박수 짝");
				}
			}
		}
	}
}
