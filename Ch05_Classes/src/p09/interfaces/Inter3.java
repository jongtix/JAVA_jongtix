package p09.interfaces;

public class Inter3 {
	public static void main(String[] args) {
		// 인터패이스의 구현
		// 구현체의 객체 생성 후 인터패이스 참조 변수에 대입
//		F3 f = new F3();
		F3 f3 = new F4();
		f3.aa();
		f3.bb();
		f3.cc();
		
		// 클래스의 구현
		F5 f5 = new F5();
		f5.aa();
		f5.bb();
		
	}
}
