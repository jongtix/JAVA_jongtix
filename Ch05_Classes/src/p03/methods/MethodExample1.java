package p03.methods;
/**
 * ...
 * 
 * 여러개의 동일한 데이터를 매개변수로 받기 위해서는 배열을 생성하는 문장이 있어야하는데
 * ...을 사용하면 배열을 만들지 않고도 실행시에 값을 여러개 입력받아 결과를 리턴받을 수 있음.
 * */
public class MethodExample1 {
	public static void main(String[] args) {
		Computer com = new Computer(); //instance 생성
		int[] intArr = new int[5];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = ++i;
		}
		com.sum1(intArr);
		System.out.println("결과 : " + com.sum1(intArr));
		
		com.sum2(1, 2, 3, 4, 5, 6);
		System.out.println("결과 : " + com.sum2(1, 2, 3, 4, 5, 6));
	}
}
class Computer {
	// 메소드 - 리턴타입 메소드명(매개변수) { 실행부; 리턴문; }
	//동일한 타입의 값을 매개변수로 받을 때
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//값의 갯수가 정해져 있지 않을 경우
	//호출 시에 매개변수의 갯수만큼의 배열이 생성되도록 정의.
	int sum2(int ...values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}