package p03.methods_access1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // field3 필드가 private이므로 다른 패키지에서 접근 불가
		
		a.method1();
		a.method2();
//		a.method3(); // method3 메소드가 private이므로 다른 패키지에서 접근 불가
	}
}
