package chap03;

import java.util.Scanner;

public class p04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("소문자 알페벳 하나를 입력하시오.>>");
		String str = s.next();
		int num = str.codePointAt(0);
		
		for (int i = 0; i < num - 96; i++) {
			for (int j = 97; j <= num - i; j++) {
				System.out.print(Character.toString((char) j));
			}
			System.out.println();
		}
	}
}
