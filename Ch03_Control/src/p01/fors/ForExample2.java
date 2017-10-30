package p01.fors;

import java.util.Scanner;

public class ForExample2 {
	public static void main(String[] args) {
		int num = 0;
		int vertical = 0; 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("출력할 구구단의 단 수 를 입력하세요.");
		num = keyboard.nextInt();
		System.out.println("출력할 기준(가로:1, 세로:2)을 입력하세요.");
		vertical = keyboard.nextInt();
		if (vertical == 2) {
			if (num >= 2 && num < 10) {
				for (int i = 1; i <= 9; i++) {
					System.out.println(num + " x " + i + " = " + num*i);
				}
			}			
		} else {
			if (num >= 2 && num < 10) {
				for (int i = 1; i <= 9; i++) {
					System.out.print(num + " x " + i + " = " + num*i + "\t");
				}
			}
		}
	}
}
