package p06.promotion;

public class ChildPromotionExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; // 부모 참조 변수에 자식 객체를 대입 -> 부모 타입으로 자동 promotion
		
		// 부모 타입으로 변했기 때문에 부모 타입의 메소드만 사용 가능.
		parent.method1();
		parent.method2(); // 자식 클래스에서 재정의 된 메소드는 부모 클래스로 변환 되더라도 자식의 메소드 내용이 출력됨.
//		parent.method3(); // 부모 클래스에 존재하지 않는 메소드이므로 사용 불가.
	}
}
