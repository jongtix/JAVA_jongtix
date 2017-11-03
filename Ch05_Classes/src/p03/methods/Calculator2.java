package p03.methods;
/**
 * 동일 클래스 내의 메소드 호출
 * - 외부객체에서 메소드 호출 시 참조변수.메소드명()하지 않고, 메소드명()으로 호출, 결과값을 사용할 수 있음.
 * */
public class Calculator2 {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
