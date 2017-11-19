package chap05;

public class Sub extends Calc {

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {
		return (a - b);
	}

}
