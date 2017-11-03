package p03.privilege2;

import p03.privilege.B; // 다른 패키지에 만든 라이브러리를 마치 현재의 패키지에 만든 것처럼 사용가능.

public class C {
//	A a; // A클래스가 default로 선언 되어 있기 때문에 다른 패키지에서 접근 불가.
	B b;
}
