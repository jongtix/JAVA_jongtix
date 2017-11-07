package p09.interfaces;

public interface Inter1 {
	int a = 3; // public static final이 생략됨.
	void display(); // public 이 생략됨
	public void print();
}

class D1 implements Inter1 {

	@Override
	public void display() {
		System.out.println("구현체 D1");
	}

	@Override
	public void print() {
		System.out.println("구현체 D1의 print");
	}
}

class D2 extends D1 {
	@Override
	public void display() { // 인터패이스를 구현한 구현체도 상속 후 메소드 재정의 가능
		System.out.println("D1을 상속 받은 D2");
	}
	@Override
	public void print() {
		System.out.println("D1을 상속 받은 D2의 print");
	}
}