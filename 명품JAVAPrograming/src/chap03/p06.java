package chap03;

import java.util.Scanner;

public class p06 {
	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오.>>");
		int money = s.nextInt();
		for (int i = 0; i < unit.length; i++) {
			if (money / unit[i] != 0) {
				System.out.println(unit[i] + "원짜리 : " + (money / unit[i]) + "개");
				money %= unit[i]; 				
			} else {
				money %= unit[i];
			}
		}
	}
}
