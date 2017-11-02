package chap02;

import java.util.Scanner;

public class p10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 원의 중심과 반지름 입력>>");
		double x1 = s.nextDouble(), y1 = s.nextDouble(), r1 = s.nextDouble();
		System.out.print("두 번째 원의 중심과 반지름 입력>>");
		double x2 = s.nextDouble(), y2 = s.nextDouble(), r2 = s.nextDouble();
		double d = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
		
		if ((r1 + r2) > d) {
			System.out.println("두 원은 서로 겹친다.");
		} else if ((r1 + r2) == d) {
			System.out.println("두 원이 닿아 있다.");
		} else {
			System.out.println("두 원은 떨어져 있다.");
		}
	}
}
