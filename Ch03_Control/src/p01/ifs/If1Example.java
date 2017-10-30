package p01.ifs;
/**
 * 제어문 - 조건문 - if문
 * if문 ()안의 값이 true일 때 실행
 * if() else문은 ()안의 값이 true일 때 if 아래부분{} 실행
 * 							 false일 때 else 아래부분{} 실행
 * if-else문은 주로 둘 중 하나를 선택해서 실행할 때 사용
 * if문은 제어의 흐름을 임의로 바꿀 때 주로 사용
 */
public class If1Example {
	public static void main(String[] args) {
		//로컬변수 선언
		int a = -7;
		if( a > 0) { //if문 ()안의 비교연산 결과값이 true이면 아래 {}부분 실행  
			System.out.println(a + "는 양수입니다.");
		} else { //if() ()안의 비교연산 결과값이 false이면 아래 {}부분 실행
			System.out.println(a + "는 음수입니다.");
		}
		
		if (a == -7) //if문 ()안의 비교연산 결과값이 true이면 아래부분 실행
					 //                              false이면 실행하지 않고 지나침
			System.out.println("a는 " + a + "입니다.");
	}
}
