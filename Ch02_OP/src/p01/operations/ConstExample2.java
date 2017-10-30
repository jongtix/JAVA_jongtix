package p01.operations;

import java.util.Scanner;

public class ConstExample2 {
	public static void main(String[] args) {
		try{
			//원의 넓이 구하기
			//원의 넓이 = (반지름) * (반지름) * PI
			final double PI = 3.14d;
			Scanner s = new Scanner(System.in);
			//반복
			while(true) { //while()문 ()안의 값이 true일 동안 반복
				System.out.println("구하기 원하는 원의 반지름을 입력하세요.");
				
				double r = s.nextDouble(); //String으로 입력된 값을 double로 반환
				
				double 넓이 = r * r * PI;
				System.out.println("넓이 = " + 넓이);
				
				System.out.print("계속 하시겠습니까?");
				String yesNo = s.next(); //String으로 입력된 값을 String으로 반환
				if (!(yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y')) break; //charAt(0)은 문자열의 첫 번째 문자 하나를 반환
			}
			System.out.println("종료");
			//자바에서는 예외(Exception)도 객체
		} catch(java.util.InputMismatchException e) {
			System.out.println("오류 발생 : " + e.getMessage());
		}   //try{실행할 명령문} catch(발생활 예외) {예외시 처리문}
			//자바에서 예외는 두가지
			//1.checked Exception : 문법관련 오류를 컴파일시 체크
			//2.unChecked Exception(RuntimeException) : 문법적 오류는 없으나 프로그램 실행시 입력자의 입력값 오류
			//															        or 연산 오류에 의해 발생하는 예외 
	}
}
