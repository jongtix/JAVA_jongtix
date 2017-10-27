package chap6;

public class Circle {
	double radius;
	String color;
	
	public Circle(double pRadius) {
		this.radius = pRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}
