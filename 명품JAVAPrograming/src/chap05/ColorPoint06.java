package chap05;

public class ColorPoint06 extends Point {
	public static void main(String[] args) {
		ColorPoint06 zeroPoint = new ColorPoint06();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint06 cp = new ColorPoint06(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
	
	String color;
	
	ColorPoint06() {
		super(0, 0);
		this.color = "BLACK";
	}
	
	ColorPoint06(int x, int y) {
		super(x, y);
	}
	
	void setXY(int x, int y) {
		move(x, y);
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return this.color + "색의 (" + this.getX() + "," + this.getY() + ")의 점";
	}
}
