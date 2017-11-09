package chpa05;

public class p01 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}
}

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	protected int getColor() { return color; }
	
	void printProperty() {
		System.out.println(this.getSize() + "인치 " + this.getColor() + "컬러");
	}
}

class IPTV extends ColorTV {
	private String IP;
	public IPTV(String IP, int size, int color) {
		super(size, color);
		this.IP = IP;
	}
	public String getIP() {	return IP; }


	void printProperty() {
		System.out.print("나의 IPTV는 " + this.getIP() + " 주소의 " + this.getSize() + "인치 " + this.getColor() + "컬러");
	}
}