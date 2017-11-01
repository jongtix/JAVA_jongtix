package chap02;

import java.util.Scanner;

public class p06 {
	public static void main(String[] args) {
		System.out.println("1~99 사이의 정수를 입력하시오. >>");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if ((n / 10) % 3 == 0) {
			if ((n % 10) % 3 == 0) {
				System.out.println("박수짝짝");
			} else {
				System.out.println("박수짝");
			}
		} else {
			if ((n % 10) % 3 == 0) {
				System.out.println("박수짝");
			} else {
				System.out.println(n);
			}
		}
	}
}
