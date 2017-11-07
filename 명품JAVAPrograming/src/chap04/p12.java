package chap04;

import java.util.Scanner;

public class p12 {
	private static String [] s = new String[10];
	private static String [] a = new String[10];
	private static String [] b = new String[10];
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		do {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int check = scanner.nextInt();
			switch (check) {
			case 1:
				res();
				break;
			case 2:
				ser();
				break;
			case 3:
				can();
				break;
			case 4:
				break;
			}
		} while (true);
	}
	
	static void res() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int seat = scanner.nextInt();
		switch (seat) {
		case 1:
			System.out.print("S>> ");
			for (int i = 0; i < s.length; i++) {
				if (s[i] != null) {
					System.out.print(s[i] + " ");
				} else {
					System.out.print("--- ");
				}
			}
			System.out.println();
			
			System.out.print("이름>>");
			String name = scanner.next();
			System.out.print("번호>>");
			int number = scanner.nextInt();
			if (s[number] != null) {
				s[number] = name;
			} else {
				System.out.println("이미 예약된 자리입니다.");
			}
			break;
		case 2:
			System.out.print("A>> ");
			for (int i = 0; i < a.length; i++) {
				if (a[i] != null) {
					System.out.print(a[i] + " ");
				} else {
					System.out.print("--- ");
				}
			}
			
			break;
		case 3:
			System.out.print("b>> ");
			for (int i = 0; i < b.length; i++) {
				if (b[i] != null) {
					System.out.print(b[i] + " ");
				} else {
					System.out.print("--- ");
				}
			}
			break;
		}
		
	}
	
	static void ser() {
		
	}
	
	static void can() {
		
	}
}
