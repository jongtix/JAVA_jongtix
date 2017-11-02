package chap02;

import java.util.Scanner;

public class p12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("연산>>");
		double x1 = s.nextDouble();
		String oper = s.next();
		char op = oper.charAt(0);
		double x2 = s.nextDouble();
		double result = 0;
//		if (op == '+') {
//			result = x1 + x2;
//		} else if (op == '-') {
//			result = x1 - x2;
//		} else if (op == '*') {
//			result = x1 * x2;
//		} else if (op == '/') {
//			if (x2 != 0) {
//				result = x1 / x2;
//			} else {
//				System.out.println("0으로 나눌 수 없습니다.");
//			}
//		}
//		System.out.println(x1 + oper + x2 + "의 계산 결과는 " + result);
		
		switch (op) {
		case '+':
			result = x1 + x2;
			break;
		case '-':
			result = x1 - x2;
			break;
		case '*':
			result = x1 * x2;
			break;
		case '/':
			if (x2 != 0) result = x1 / x2;
			else System.out.println("0으로 나눌 수 없습니다.");
		default:
			break;
		}
		System.out.println(x1 + oper + x2 + "의 계산 결과는 " + result);
	}
}
