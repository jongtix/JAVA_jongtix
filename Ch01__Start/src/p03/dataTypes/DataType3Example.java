package p03.dataTypes;
/**
 * 데이터 타입
 * - 자바 프로그램에서 연산은 반드시 동일한 타입끼리 연산을 함.
 * - 변수 선언시 초기값으로 입력한 값을 literal이라고 함.
 *   literal도 데이터 타입을 가짐.
 * - 연산 중간값도 타입을 가짐, 연산 중간 결과도 타입 변환됨.
 *   타입이 변환 될 때는 작은 데이터 타입이 큰 데이터 타입으로 자동변환됨.
 *   byte -> short -> int -> long -> float -> double
 *   		  char -> int -> long -> float -> double
 *   10진수 12.375를 2진수로 바꾸기 => 1100.011(2)
 */
public class DataType3Example {
	public static void main(String[] args) {
		double result;
		// '=' 대입 연산자 / 1이라는 int타입의 리터럴을 int타입의 변수a에 대입하라는 의미
		int a = 1; // 연산자(=)를 기준으로 왼쪽과 오른쪽이 타입이 같아야함.
		int b = 2;
		double c = 0.5; // 0.5 double타입값을 double타입의 변수 c에 대입하라는 의미
		result = (a + b) * c; // int타입 a와 int타입 b가 먼저 연산됨. 결과는 int
							  // ()안의 연산을 한 결과는 int값과 *연산을 하는 c는 double타입임.
							  // *연산자를 기준으로 왼쪽은 int타입, 오른쪽은 double타입.
							  // 이때 int가 double로 타입이 자동 변경
							  // double * double 형식으로 바뀌어 double이 됨.
		System.out.println("result = " + result);
	}
}
