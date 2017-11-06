package p05.polmorph.instaceof;

public class InstanceOfExample {
	// 메소드
	public static void main(String[] args) {
		// 객체생성
		Parent parentA = new Child(); // 부모 타입으로 선언한 참조변수에 자식 객체 대
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
//		method2(parentB); // 실행시 오류 발생
						  // - 생성을 부모객체로 했기 때문에 자식 타입으로 casting 불가.
		
	}
	
	public static void method1(Parent p) {
		if (p instanceof Child) { // 값으로 받은 p가 Child 타입으로 Casting 이 가능한지 확인
			Child child = (Child) p;
			System.out.println("method1 - Child변환 성공");
		} else {
			System.out.println("method1 - Child로 변환 불가");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
}
