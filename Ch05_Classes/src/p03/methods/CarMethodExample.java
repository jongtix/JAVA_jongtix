package p03.methods;

public class CarMethodExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(5);
		System.out.println("초기값 : " + myCar.gas);
		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입해주세요.");
		}
	}
}
