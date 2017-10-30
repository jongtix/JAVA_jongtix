package p01.ifs;

import java.util.Scanner;

/**
 * 중첩if = if 문 내에 if문이 존재
 */
public class If4Example {
	public static void main(String[] args) {
		while(true) {			
			//로컬변수 선언, 초기화
			int score = 0;
			String grade = "";
			System.out.println("점수를 입력하세요.");
			Scanner keyboard = new Scanner(System.in);
			score = keyboard.nextInt();
			
			if(score >= 90) {
				if(score > 96) grade = "A+";
				else if (score < 94) grade = "A-";
				else grade = "A0";
			} else if(score >= 80) {
				if(score > 86) grade = "B+";
				else if (score < 84) grade = "B-";
				else grade = "B0";
			} else if (score >= 70) {
				if(score > 76) grade = "C+";
				else if (score < 74) grade = "C-";
				else grade = "C0";
			} else if (score >= 60) {
				if(score > 66) grade = "D+";
				else if (score < 64) grade = "D-";
				else grade = "D0";
			} else {
				grade = "F";
			}
			
			System.out.println("입력한 점수는 " + grade + "등급입니다.");
			System.out.println();
			System.out.println("끝내시겠습니까?");
			char yesNo = keyboard.next().charAt(0); //키보드로부터 한번 입력받아서 변수에 
//			if(keyboard.next().charAt(0) = 'y' || keyboard.next().charAt(0) = 'Y') //두번 실행됨. why? ||앞에서 한번 물어보고 ||뒤에서 한번 물어보고. 
			if( yesNo == 'y' || yesNo == 'Y') {
				System.out.println("종료");
				break;
			}
		}
	}
}
