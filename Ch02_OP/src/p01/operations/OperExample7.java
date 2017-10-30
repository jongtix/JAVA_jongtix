package p01.operations;
/**
 * 복합대입연산자
 * - 연산과 대입을 동시에 처리하는 연산자
 * - a +=b, a -= b, a *= b, a /= b, a %= b 등.
 * - 순서는 왼쪽의 연산처리 후 대입순
 */
public class OperExample7 extends Object { //모든 클래스는 최상위클래스인 Object클래스를 상속받아 생성
	//생성자(default생성자)
	//Java는 반드시 생성자가 있어야 객체를 생성할 수 있다.
	//모든 클래스는 생성자가 존재하는데 개발자가 생성자를 표시하지 않으면
	//컴파일러가 컴파일 시 매개변소도 없고, 실행 내용도 없는 default 생성자를 추가하여 컴파일한다.
	OperExample7(){}
	public static void main(String[] args) {
		//반복문
		int sum = 0; //로컬변수
		int temp = 0; //임시저장 변수
		for(int i = 1; i <= 10; i++) {
			//sum변수의 값과 i의 값을 더한 결과값을 다시 sum에 대입하는 대입문
//			sum = sum + i; //한번씩 반복하면서 합계(sum)에 값을 추가하는 명령문
			temp = sum + i; //sum 값과 i의 값을 합한 결과를 temp에 저장
			sum = temp; //저장한 temp의 값을 다시 sum에 저장
		}
		System.out.println("합계는 " + sum);
		
		for(int i = 1; i <= 10; i++) {
			sum += i; //sum 값에 i의 값을합한 결과를 다시 sum에 대입하는 복합대입문
		}
		System.out.println("합계는 " + sum);
	}
}
