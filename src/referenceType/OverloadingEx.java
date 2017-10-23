package referenceType;

public class OverloadingEx {
	public static void main(String[] args) {
		MyClass2 myObject = new MyClass2();
		
		myObject.print(4);
		
		myObject.print("아이쿠");
		
		myObject.print(4, 10);
		
		myObject.print(1, 2, 4, 123);
		
		int sum = myObject.sum(15, 654, 64565);
		System.out.println(sum);
	}
}
