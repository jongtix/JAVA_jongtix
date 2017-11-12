package chpa05;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char op = scanner.next().charAt(0);
		switch (op) {
		case '+':
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		}
	}
}
