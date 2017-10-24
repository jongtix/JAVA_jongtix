package io;

import java.util.Scanner;

public class MyAppconsoleInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("텍스트를 입력하세요 : ");
		
		Double str = scanner.nextDouble();
		
		System.out.println("입력 받은 값은 : " + str);
		
		scanner.close();
	}
}
