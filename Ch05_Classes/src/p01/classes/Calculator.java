package p01.classes;
/**
 * 계산기
 * 피연산자 2개, 연산자 1개
 * */
public class Calculator {
	//속성
	private int field1; //초기값 0
	private int field2; //초기값 0
	private char op; //초기값 " "
	private double result;
	
	//메소드
	public void setField1(int field1) {
		this.field1 = field1;
	}
	public void setField2(int field2) {
		this.field2 = field2;
	}
	public void setOp(char op) {
		this.op = op;
	}
	
	//int, int, char
	public void calc() {
		switch (op) {
		case '+':
			result = field1 + field2;
			System.out.println(result);
			break;
		case '-':
			result = field1 - field2;
			System.out.println(result);
			break;
		case 'x':
			result = field1 * field2;
			System.out.println(result);
			break;
		case '/':
			result = field1 / field2;
			System.out.println(result);
			break;
		}	
	}
	
	public double getCalc() {
		System.out.println(result);
		return result;
	}
	
}
