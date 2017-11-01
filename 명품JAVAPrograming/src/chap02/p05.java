package chap02;

import java.util.Scanner;

public class p05 {
	public static void main(String[] args) {
		System.out.println("정수 3개를 입력하시오.>>");
		Scanner scanner = new Scanner(System.in);
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		int i3 = scanner.nextInt();
		
		if (i1 < i2 + i3 && i2 < i1 + i3 && i3 < i1 + i2) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 될 수 없습니다.");
		}
	}
}
