package chap02;

import java.util.Scanner;

public class p01 {
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원)>>>");
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		double d = (double) w / (double) 1100;
		System.out.println(w + "원은 $" + d + "입니다.");
	}
}
