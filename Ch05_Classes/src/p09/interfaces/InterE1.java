package p09.interfaces;

public interface InterE1 {
	public void aa(); // 추상 메소드
}

interface E2 extends InterE1 {
//	public void aa();
	public void bb(); // 추상 메소드 추가
}

interface E3 extends E2 {
//	public void aa();
//	public void bb();
	public void cc(); // 추상 메소드 추가
}

class C4 implements E3 {

	@Override
	public void aa() {
		System.out.println("E1 메소드");
	}
	
	@Override
	public void bb() {
		System.out.println("E2 메소드");
	}

	@Override
	public void cc() {
		System.out.println("E3 메소드");
	}
	
}