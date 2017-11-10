package chpa05;

import java.util.Scanner;

public class StackApp {
	static Scanner scanner = new Scanner(System.in);
	static String str;
	public static void main(String[] args) {
		System.out.println("총 스택 저장 공간의 크기 입력 >> ");
		int number = scanner.nextInt();
		StringStack stack = new StringStack(number);
		do {
			System.out.println("문자열 입력 >> ");
			str = scanner.next();
		} while(stack.push(str));
	}
}
