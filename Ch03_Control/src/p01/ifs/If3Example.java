package p01.ifs;

import java.util.Scanner;

/**
 * if-else if-else : 둘 중 하나인 경우ㅜ가 아닌 다수의 경우가 발생하는 경우
 */
public class If3Example {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			System.out.println("점수를 입력하세요.");
			try {
				int score = keyboard.nextInt(); //String타입으로 입력된 숫자형 문자열을 숫자로 반환
				String grade = ""; //등급
				if(score < 0) { //제어를 개발자가 임의로 바꾼경우
					System.out.println("성적은 0보다 커야합니다.");
					System.out.println("점수를 다시 입력하세요.");
					score = keyboard.nextInt();
				}
				//조건문 if-else if-else
				if(score >= 90) grade = "A";
				else if (score >= 80) grade = "B";
				else if (score >= 70) grade = "C";
				else if (score >= 60) grade = "D";
				else grade = "F";
				System.out.println("입력한 점수는 " + grade + "등급입니다.");
			} catch(java.util.InputMismatchException e) {
				System.out.println(e.getMessage()); //오류출력
			}
			
			System.out.println("끝내시겠습니까?");
			String yesNo = keyboard.next();
			if(yesNo.charAt(0) == 'y' || yesNo.charAt(0) == 'Y') {
				System.out.println("종료");
				break;
			}
		}
	}
}
