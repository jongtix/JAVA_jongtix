package chap02;

import java.util.Scanner;

public class p02 {
	public static void main(String[] args) {
		System.out.println("2자리수 정수 입력(10~99)>>>");
		Scanner s = new Scanner(System.in);
		int i = 0, j = 0, k = 0;
		k = s.nextInt();
		i = k/10;
		j = k%10;
		if (i == j) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No... 10의 자리와 1의 자리가 다릅니다.");
		}
	}
}
