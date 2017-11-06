package p07.casting;

public class ChildExample {
	public static void main(String[] args) {
		// 상속 관계에 있는 부모 타입의 참조변수에 자식 클래스 객체를 대입
		Parent parent = new Child(); // promotion
		parent.field1 = "data1"; // 부모 타입으로 변경된 후, 부모 필드 접근 가능.
		parent.method1(); // 부모 타입으로 변경된 후, 부모 메소드 접근 가능.
		parent.method2();
		
//		parent.field2; // 부모 타입으로 변경된 후, 자식 클래스에서 추가된 필드 접근 불가.
//		parent.method3(); // 부모 타입으로 변경된 후, 자식 클래스에서 추가된 메소드 접근 불가.
		
		// 추가된 자식 메소드와 필드를 사용해야하는 경우
		Child child = (Child) parent; // casting
		child.field2 = "yyyy"; // 자식 타입으로 강제 형변환 후, 추가된 자식 필드에 접근 가능.
		child.method3(); // 자식 타입으로 강제 형변환 후, 추가된 자식 메소드에 접근 가능.
	}
}
