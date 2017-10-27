package p01.operations;

import java.util.Scanner;

/**
 * 사칙연산
 */
public class OperExample2 {
	public static void main(String[] args) {
		//콘솔로부터 값을 입력 받기 위한 객체 생성
		Scanner scanner = new Scanner(System.in); //System.in은 입력 스트림
		System.out.println("x값을 입력하세요.");
		int x = scanner.nextInt(); //입력받은 문자열 타입의 값을 int타입으로 변환
		System.out.println("y값을 입력하세요.");
		int y = Integer.parseInt(scanner.next()); //scanner.next()는 입력받은 문자열을 문자열로 출력
												  //Integer.parseInt()메소드는 ()의 숫자타입의 문자열을 int로 변환
		
		//입력 받은 값으로 사칙연산
		//"문자열" + "문자열이 아닌 식의 결과값, 문자열이 아닌 값"의 결과는 "문자열"
		//println()메소드는 문자열 타입을 출력하는 메소드
		System.out.println(2); //int타입의 리터럴이 문자열 "2"로 바뀌어 println()메소드의 매개변수로 전달됨.
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
	}
}
