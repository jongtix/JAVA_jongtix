package p03.methods_access2;

import p03.methods_access1.A;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;
//		a.field2 = 1; // field2 필드가 default이므로 다른 패키지에서 접근 불가
//		a.field3 = 1; // field3 필드가 private이므로 다른 패키지에서 접근 불가
		
		a.method1();
//		a.method2(); // method2 메소드가 default이므로 다른 패키지에서 접근 불가
//		a.method3(); // method3 메소드가 private이므로 다른 패키지에서 접근 불가
	}
}
