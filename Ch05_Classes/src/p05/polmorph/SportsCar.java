package p05.polmorph;
/**
 * 상속 클래스명 extends 부모 클래스
 * */
public class SportsCar extends Car {
	@Override // 컴파일러에게 재정의 되었음을 알려주는 기능
	public void speedUp() {
//		super.speedUp(); // 부모 클래스의 메소드 사용 : super.메소드();
		speed += 10; // 재정의(부모 메소드에서 1씩 증가하는 메소드를 자식 클래스에서 10씩 증가하도록 재정의)
	}
	
	// 부모 클래스에서 final로 지정된 메소드이므로 자식 클래스에서 재정의 불가.
//	private void stop() {
//		System.out.println("자식 메소드에서 재정의");
//		speed = 0;
//	}
}
