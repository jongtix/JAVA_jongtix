package chap11;

public class ChildCalculator extends Calculator {
	private int result;
	
	public ChildCalculator() {
		result = 0;
	}
	
	public void add() {
		System.out.println(result);
	}
	
	public void add(int a) {
		result = result + a;
		System.out.println(result);
	}
	
	public void add(int a, double b) {
		result = a + (int)Math.round(b);
	}
	
	public void add(String a, String b, String c) {
		System.out.println(a + b + c);
	}
}
