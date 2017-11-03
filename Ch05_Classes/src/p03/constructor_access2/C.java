package p03.constructor_access2;

import p03.constructor_access1.A;

public class C {
	// 필드
	A a1 = new A(true); // public이므로 다른 패키지 내에서 접근 가능 
//	A a2 = new A(1); // default이므로 다른 패키지 내에서 접근 불가
//	A a3 = new A("문자열"); // private이므로 다른 패키지 내에서 접근 불가
}
