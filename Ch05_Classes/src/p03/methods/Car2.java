package p03.methods;

public class Car2 {
	//static 필드
	static int field1;
	static void method1() {
		System.out.println("정적메소드");
	}
	
	static {
		field1 = 12;
//		field2 = 19; // instance필드는 static 초기화 블록에 올 수 없음.
		method1();
//		method2(); // instance메소드는 static 초기화 블록에 올 수 없음.
	}
	
	//instance 필드
	int field2;
	void method2() {
		System.out.println("인스턴스 메소드");
	}
	
	{
		field1 = 11;
		field2 = 10;
		method1();
		method2();
	}
}
