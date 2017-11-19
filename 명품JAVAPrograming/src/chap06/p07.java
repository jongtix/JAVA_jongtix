package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println(">>");
			String str = scanner.nextLine();
			if (str.equals("그만")) {
				System.out.println("종료합니다...");
				System.exit(0);
			}
			String [] string = str.split(" ");
			System.out.println("어절 개수는 " + string.length);
		}
		
//		while (true) {
//			System.out.println(">>");
//			String str = scanner.nextLine();
//			if (str.equals("그만")) {
//				System.out.println("종료합니다...");
//				System.exit(0);
//			}
//			StringTokenizer string = new StringTokenizer(str, " ");
//			System.out.println("어절 개수는 " + string.countTokens());
//		}
	}
}
