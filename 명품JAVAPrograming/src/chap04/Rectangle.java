package chap04;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return width * height;
	}
	
	void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	boolean contains(Rectangle r) {
		if ((r.x > this.x && r.x < this.width + this.x) && (r.y > this.y && r.y < this.height + this.y)) {
			if ((this.x + this.width > r.x + r.width) && (this.y + this.height > r.y + r.height)) {
				return true;
			} else {
				return false;
			}			
		} else {
			return false;
		}
	}
	
}
