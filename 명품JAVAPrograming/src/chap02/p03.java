package chap02;

import java.util.Scanner;

public class p03 {
	public static void main(String[] args) {
		System.out.println("금액을 입력하시오>>");
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int a = w / 50000;
		int b = (w % 50000) / 10000;
		int c = ((w % 50000) % 10000) / 1000;
		int d = (((w % 50000) % 10000) % 1000) / 100;
		int e = ((((w % 50000) % 10000) % 1000) % 100) / 50;
		int f = (((((w % 50000) % 10000) % 1000) % 100) % 50) / 10;
		int g = ((((((w % 50000) % 10000) % 1000) % 100) % 50) % 10) / 1;
		System.out.println("오만원권 " + a + "매");
		System.out.println("만원권 " + b + "매");
		System.out.println("천원권 " + c + "매");
		System.out.println("백원 " + d + "개");
		System.out.println("오십원 " + e + "개");
		System.out.println("십원 " + f + "개");
		System.out.println("일원 " + g + "개");
	}
}
