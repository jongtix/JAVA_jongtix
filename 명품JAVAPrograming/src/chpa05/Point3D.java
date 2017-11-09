package chpa05;

public class Point3D extends Point {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");

		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}
	
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}

	public String toString() {
		return "(" + this.getX() + "," + this.getY() + "," + this.getZ() + ")의 점";
	}
	
	void moveUp() {
		this.z++;
	}
	
	void moveDown() {
		this.z--;
	}
	
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
}
