package p05.bounded;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str = Util.compare("a", "b"); // 오류발생 // Number를 상속받은 객체만 대상
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
}
