package chap04;

public class TV {
	String name;
	int year;
	int size;
	
	TV(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(this.name + "에서 만든 " + this.year + "년형 " + this.size + "인치 TV");
	}
}
