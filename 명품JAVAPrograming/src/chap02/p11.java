package chap02;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int m = s.nextInt();
		
		if (m == 12 || m == 1 || m ==2) {
			System.out.println("겨울");
		} else if (m == 3 || m == 4 || m == 5) {
			System.out.println("봄");
		} else if (m == 6 || m == 7 || m == 8) {
			System.out.println("여름");
		} else if (m == 9 || m == 10 || m == 11) {
			System.out.println("가을");
		} else {
			System.out.println("잘못입력");
		}
		
//		switch (m) {
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("겨울");
//			break;
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("봄");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("여름");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("가을");
//			break;
//		default:
//			System.out.println("잘못입력");
//			break;
//		}
	}
}
