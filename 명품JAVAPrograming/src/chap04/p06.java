package chap04;

import java.util.Scanner;

public class p06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		int maxIndex = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[i].radius > c[j].radius) maxIndex = i;
			}
		}
		c[maxIndex].show();
		scanner.close();
	}
}