package p06.promotion;
/**
 * 객체의 다형성 - 최상위 객체 참조변수에는 상속을받은 자식들의 instance 객체가 대입 가능하며,
 * 				   대입연산시 자동으로 부모 타입으로 형 변환(Promotion).
 * */
public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 최상위(A) 참조변수에 대입
		A a1 = b; // 자식 객체가 부모타입의 참조변수에 대입되면서 자동 형 변환
		A a2 = c; // Promotion
		A a3 = d; // Promotion
		A a4 = e; // Promotion
		
		B b1 = d; // 상속관계에서 자식의 객체가 부모 참조변수에 대입. 자동 형 변환
		C c1 = e; // Promotion
		
//		B b3 = e; // 상속관계가 아니기 때문에 대입 불가
//		C c3 = d;
		
		// 문법적으로는 가능하나 실행시 Casting 예외 발생
		B b4 = new B();
		A a5 = b4;
		C c4 = (C) a5; 
		
	}
}
