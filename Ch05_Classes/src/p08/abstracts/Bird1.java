package p08.abstracts;
/**
 * 추상 클래스를 상속받은 자식 클래스에서 추상 메소드로 선언된 메소드들의 실체(실행부)를 기술.
 * */
public class Bird1 extends Animal {

	@Override
	public void sing() {
		System.out.println("새가 운다.");
	}

	@Override
	public void fly() {
		System.out.println("새가 난다.");
	}

	@Override
	public void eat() {
		System.out.println("새가 먹는다.");
	}

}
