package chpa06;

public class MyPoint {
	private int x;
	private int y;
	private String str;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
		this.toString();
	}
	
	@Override
	public String toString() {
		return "Point(" + this.x + "," + this.y + ")";
	}
	
	public boolean equals(MyPoint obj) {
		if (this.x == obj.x && this.y == obj.y) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if (p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른 점");
		}
	}
}
