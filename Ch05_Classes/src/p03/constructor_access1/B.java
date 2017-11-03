package p03.constructor_access1;

public class B {
	// 필드
	A a1 = new A(true); // 동일 패키지 내의 public 접근 제한을 가지는 생성자 호출
	A a2 = new A(1); // 동일 패키지 내의 default 접근 제한을 가지는 생성자 호출
//	A a3 = new A("문자열"); // 동일 패키지 내의 private 접근 제한자를 가지는 생성자 호출 불가.
}
