package p07.casting;
/**
 * 자식 클래스인 Child에서 추가된 필드와 메소드는 Parent 타입으로 형변환 되면 사용 불가.
 * */
public class Child extends Parent {
	// 자식 클래스에서 추가된 필드
	public String field2;
	
	// 자식 클래스에서 추가된 메소드
	public void method3() {
		System.out.println("child-method3()");
	}
}
