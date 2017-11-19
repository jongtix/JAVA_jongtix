package chap06;

import java.util.Scanner;

public class p08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String str = scanner.nextLine();
		String [] string = str.split("");
		int cnt = 0;
		do {
			for (int i = 0; i < string.length; i++) {
				System.out.print(string[i]);
			}
			System.out.println();
			String first = string[0];
			for (int j = 0; j < string.length - 1; j++) {
				string[j] = string[j + 1];
			}
			string[string.length - 1] = first;
			cnt++;
		} while (cnt < string.length);
	}
}
