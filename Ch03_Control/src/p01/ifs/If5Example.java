package p01.ifs;

import java.util.Scanner;

public class If5Example {
	public static void main(String[] args) {
		while (true) {
			System.out.println("점수를 입력하세요.");
			int score = 0;
			String grade = "";
			Scanner keyboard = new Scanner(System.in);
			score = keyboard.nextInt();
			// if문 시작
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else
				grade = "F";
			// if문 끝
			if (score >= 100)
				grade = "A+";
			else if (score >= 60) {
				if (score % 10 > 7)
					grade += "+";
				else if (score % 10 < 4)
					grade += "-";
				else
					grade += "0";

				System.out.println("등급은 " + grade + "입니다.");
				System.out.println();
				System.out.println("종료하시겠습니까?");
				char yesNo = keyboard.next().charAt(0);
				if (yesNo == 'y' || yesNo == 'Y') {
					System.out.println("종료");
					break;
				}
			}
		}
	}
}
