package p01.switches;

import java.util.Scanner;

/**
 * 조건문 - Switch문
 * 			switch(조건) - 조건에 따라 미리 실행할 작업을 분기해놓은 제어문
 */
public class Switch1Example {
	public static void main(String[] args) {
		int score = 0;
		String grade = "";
		while(true) {
			System.out.println("점수를 입력하세요.");
			Scanner keyboard = new Scanner(System.in);
			score = keyboard.nextInt();
			//case에 따라 분기
			switch (score/10) {
			case 10: //break문이 없으면 아래 case문까지 실행함
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F";;
			}
			if (score >= 60 && score < 100) {
				if (score%10 > 7) grade += "+";
				else if (score%10 < 4) grade += "-";
				else grade += "0";
			}
			System.out.println("등급은 " + grade);
			System.out.println("종료하시겠습니까?");
			String yesNo = keyboard.next();
			if ( yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("y")) {
				System.out.println("종료");
				break;
			}
		}
	}
}
