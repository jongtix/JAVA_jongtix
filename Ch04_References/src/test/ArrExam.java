package test;

import java.util.Scanner;

public class ArrExam {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				//입력한 수만큼 배열 생성
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("점수를 입력하세요.");
					scores[i] = scanner.nextInt(); 
				}
				//점수 입력
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] : " + scores[i] + "\n");
				}
				//점수 리스트 출력
			} else if (selectNo == 4) {
				run = false;
			}
		}
		System.out.println("종료");
	}
}
