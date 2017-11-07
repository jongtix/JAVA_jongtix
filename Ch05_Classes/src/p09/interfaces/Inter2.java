package p09.interfaces;

public class Inter2 {
	public static void main(String[] args) {
		E2 e2 = new C4();
		e2.aa(); // 상속 받은 메소드
		e2.bb(); // 추가된 메소드
//		e2.cc(); // 상속 관계에서 e2에 없는 메소드
		
		// C4는 인터패이스들의 상속 관계의 최하위인 E3를 구현한 구현체
		// E3는 상위의 추상 메소드들을 모두 가지고 있는 인터패이스이므로 구현체인 C4에서는 모두 재정의 해줘야함.
		C4 c4 = new C4();
		c4.aa();
		c4.bb();
		c4.cc();
	}
}
