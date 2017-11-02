package chap02;

import java.util.Scanner;

public class p09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double r = s.nextDouble(), cx = s.nextDouble(), cy = s.nextDouble();
		System.out.print("점 입력>>");
		double x = s.nextDouble(), y = s.nextDouble();
		double d = Math.sqrt((x - cx)*(x - cx) + (y - cy)*(y - cy));
		
		if (d < r) {
			System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
		} else if (d == r) {
			System.out.println("점 (" + x + ", " + y + ")는 원 둘레에 있다.");
		} else {
			System.out.println("점 (" + x + ", " + y + ")는 원 밖에 있다.");
		}
	}
}
