package p01.operations;
/**
 * 논리 연산자 부정 !
 * - true -> false, false -> true
 * - 조건문 if()는 ()안의 값 or 식의 결과가 true이면 if의 {}실행
 * 											false이면 else의 {}실행 
 */
public class NotOperExample1 {
	public static void main(String[] args) {
		boolean stop = false; //초기값이 false
		if(!stop) { //! + false => true
			System.out.println("정지");
		} else {
			System.out.println("진행");
		}
		
		if(stop != true) { //"stop == true" = "stop != false" 
			System.out.println("정지");
		} else {
			System.out.println("진행");
		}
	}
}
