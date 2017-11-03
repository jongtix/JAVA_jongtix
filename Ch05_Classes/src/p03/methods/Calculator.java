package p03.methods;
/**
 * 메소드 선언
 * 		리턴타입 메소드명(매개변수) {
 * 			실행부;
 * 			return;
 * 		}
 * 
 * - 리턴타입이 없는 메소드
 * 		void 메소드명(매개변수) {
 * 			실행부;
 * 		}
 * */
public class Calculator {
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double devide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
