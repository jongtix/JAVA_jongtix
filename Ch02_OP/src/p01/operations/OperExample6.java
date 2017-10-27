package p01.operations;

/**
 * 삼항연산자
 * 조건식 ? 참 : 거짓
 * 				 조건 ? 참 : 거짓
 * 							 조건 ? 참 : 거짓
 * 										 조건 ? 참 : 거짓
 */
import java.util.Scanner;

public class OperExample6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isContinue = true;
		while (isContinue) { //boolean 타입의 값은 제어문(반복문)의 제어에 사용
			System.out.println("점수를 입력하세요. (종료하시려면 End를 입력하세요.)");
			int score = Integer.parseInt(scanner.next()); // next() 키보드로 입력된 문자열 값을 문자열로 리턴하는 메소드
			char grade = ' '; // char 타입의 초기화시 빈 문자는 ' '로 초기화
			grade = score > 90 ? 'A' : score > 80 ? 'B' : score > 70 ? 'C' : 'F';
			System.out.println("등급 : " + grade);
			
			//charAt(index) 메소드는 문자열에서 해당 index의 문자하나를 추출하는 메소드
			char yesNo = scanner.next().charAt(0);
			isContinue = (yesNo == 'e' || yesNo == 'E') ? false : true;
		}
	}
}
