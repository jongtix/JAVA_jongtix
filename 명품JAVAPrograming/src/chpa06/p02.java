package chpa06;

public class p02 {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if (a.equals(b)) {
			System.out.println("같은 원");
		} else {
			System.out.println("다른 원");
		}
	}
}

class Circle {
	private int x;
	private int y;
	private int radius;
	
	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		toString();
	}
	
	@Override
	public String toString() {
		return "Circle(" + this.x + "," + this.y + ")반지름" + this.radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		Circle circle = (Circle) obj;
		if (this.x == circle.x && this.y == circle.y) {
			return true;
		} else {
			return false;
		}
	}
}