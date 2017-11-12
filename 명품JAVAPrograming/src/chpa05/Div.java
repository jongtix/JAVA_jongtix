package chpa05;

public class Div extends Calc {

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {
		return (a / b);
	}

}
