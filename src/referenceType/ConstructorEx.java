package referenceType;

public class ConstructorEx {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		
		System.out.println("int " + c1.getNum());
		System.out.println(c1.getName());
		
		MyClass c2 = new MyClass(10);
		System.out.println("int " + c2.getNum());
		System.out.println(c2.getName());
		
		MyClass c3 = new MyClass(30, "버거킹");
		System.out.println(c3.getNum());
		System.out.println(c3.getName());
	}
}
