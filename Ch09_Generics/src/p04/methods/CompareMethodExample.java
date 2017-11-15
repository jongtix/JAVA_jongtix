package p04.methods;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(new Integer(1), "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(new Integer(1), "사과");
		boolean result1 = Util2.compare(p1, p2);
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 다른 객체입니다.");
		}
	}
}
