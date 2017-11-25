package challenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) throws InputMismatchException {
		System.out.print("계산할 수식을 입력하세요. : ");
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		char c = s.next().charAt(0);
		int j = s.nextInt();
		
		int z = 0;
		if (c == '+') {
			z = i + j;
		} else if (c == '-') {
			z = i - j;
		} else if (c == '*') {
			z = i * j;
		} else if (c == '/') {
			z = i / j;
		}
		System.out.println(z);
	}
}
