package p01.switches;

import java.util.Scanner;

/**
 * Switch(조건문) { case: break; }
 */
public class Switch3Example {
	public static void main(String[] args) {
		//계산기 만들기
		//값1 op 값2
		double arg1 = 0;
		double arg2 = 0;
		char op = ' ';
		double result = 0.0000d;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("계산기 프로그램 값1 op 갑2 형태");
		System.out.print("첫 번째 값을 입력하세요.");
		arg1 = keyboard.nextInt();
		System.out.println("연산자를 입력하세요. +, -, x, /");
		op = keyboard.next().charAt(0);
		System.out.println("두 번째 값을 입력하세요.");
		arg2 = keyboard.nextInt();
		
		switch(op) {
		case '+': result = arg1 + arg2; break;
		case '-': result = arg1 - arg2; break;
		case 'x': result = arg1 * arg2; break;
		case '/': result = arg1 / arg2; break;
		}
		
		System.out.println("계산 결과는 " + result + "입니다.");
	}
}
