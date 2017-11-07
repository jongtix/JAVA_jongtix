package chap04;

public class Sub {
	int a, b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return (this.a - this.b); 
	}
}
