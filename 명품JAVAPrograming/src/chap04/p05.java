package chap04;

import java.util.Scanner;

class Circle {
	private double x, y;
	public int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + this.x + "," + this.y + ")" + radius);
	}
}

public class p05 {
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
		for (int i = 0; i < c.length; i++) {
			c[i].show();
		}
		scanner.close();
	}
}