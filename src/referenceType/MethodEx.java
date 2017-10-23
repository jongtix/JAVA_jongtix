package referenceType;

public class MethodEx {
	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();
		MyClass myClass3 = new MyClass();
		
		myClass1.setNum(3);
		System.out.println(myClass1.getNum());
		
		MyClass myClass2 = new MyClass();
		
		myClass2.setName("정택근");
		System.out.println(myClass2.getName());
		
		System.out.println(myClass1.getClassName());
		System.out.println(myClass3.getClassName());
		System.out.println(MyClass.getClassName());
	}
	
	public static void staticMethod() {
		
	}
	public void someMethod() {
		staticMethod();
	}
}
