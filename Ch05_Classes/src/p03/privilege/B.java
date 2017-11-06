package p03.privilege;
/**
 * 하나의 소스 파일에는 여러 개의 클래스가 선언 가능.
 * 단, public으로 선언된 클래스는 하나만 존재
 * 그리고, public으로 선언된 클래스명과 소스 파일명이 동일해야함.
 * */
// default접근 제한
// 같은 패키지 내에서는 public 과 동일한 접근권한
// 다른 패키지에서는 접근 불가.
class A {

}

// public
// 같은 패키지, 다른 패키지의 모든 객체가 접근 가능
public class B {
	A a; // 동일 패키지 내의 클래스인 A클래스에서 접근 가능.
}