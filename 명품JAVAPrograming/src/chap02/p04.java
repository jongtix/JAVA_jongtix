package chap02;

import java.util.Scanner;

public class p04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		int i1 = s.nextInt();
		int i2 = s.nextInt();
		int i3 = s.nextInt();
		
		if (i1 > i2) {
			if (i1 > i3) {
				System.out.println((i2 > i3) ? i2 : i3);
			} else {
				System.out.println(i1);
			}
		} else if (i2 > i3) {
			if (i2 > i1) {
				System.out.println((i1 > i3) ? i1 : i3);
			} else {
				System.out.println(i2);
			}
		} else if (i3 > i1) {
			if (i3 > i2) {
				System.out.println((i1 > i2) ? i1 : i2);
			} else {
				System.out.println(i3);
			}
		}
	}
}
