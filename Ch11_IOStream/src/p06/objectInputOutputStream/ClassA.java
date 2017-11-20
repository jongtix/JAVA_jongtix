package p06.objectInputOutputStream;

import java.io.Serializable;

/**
 * 직렬화/역직렬화가 가능한 클래스 - implements Serializable
 * */
public class ClassA implements Serializable {
	private static final long serialVersionUID = 1L;
	int field1; // 인스턴스 필드
	ClassB field2 = new ClassB(); // 인스턴스 필드 객체로 초기화
	static int field3 = 4; // static 필드
	transient int field4; // 인스턴스 필드 (transient)로 선언된 필드는 직렬화에서 제외됨.
}

class ClassB implements Serializable {
	int field1; // field2.field1
}