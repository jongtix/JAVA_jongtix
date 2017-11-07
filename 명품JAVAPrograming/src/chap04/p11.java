package chap04;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char c = scanner.next().charAt(0);
		if (c == '+') {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		} else if (c == '-') {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		} else if (c == '*') {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		} else if (c == '/') {
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		}
	}
}
