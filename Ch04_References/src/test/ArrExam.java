package test;

import java.util.Scanner;

public class ArrExam {
	public static void main(String[] args) {
		boolean run = true;
		boolean run2 = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				System.out.println();
				// 입력한 수만큼 배열 생성
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("score[" + i + "] > ");
					scores[i] = scanner.nextInt();
				}
				System.out.println();
				// 점수 입력
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] : " + scores[i] + "\n");
				}
				System.out.println();
				// 점수 리스트 출력
			} else if (selectNo == 4) {
				while(run2) {
					System.out.println();
					System.out.println("----------------------------------------------------------");
					System.out.println("1. 오름차순정렬 | 2. 내림차순정렬 | 3. 등급 출력 | 4. 종료");
					System.out.println("----------------------------------------------------------");
					System.out.print("선택>");
					int selectNo2 = scanner.nextInt();
					if (selectNo2 == 1) {
						int temp = 0;
						for (int i = 0; i < scores.length; i++) {
							for (int j = 0; j < scores.length; j++) {
								if (scores[i] < scores[j]) {
									temp = scores[i];
									scores[i] = scores[j];
									scores[j] = temp;
								}
							}
						}
						for (int i = 0; i < scores.length; i++) {
							System.out.print(scores[i] + "\t");						
						}
						System.out.println();
						System.out.println();
					} else if (selectNo2 == 2) {
						int temp = 0;
						for (int i = 0; i < scores.length; i++) {
							for (int j = 0; j < scores.length; j++) {
								if (scores[i] > scores[j]) {
									temp = scores[i];
									scores[i] = scores[j];
									scores[j] = temp;
								}
							}
						}
						for (int i = 0; i < scores.length; i++) {
							System.out.print(scores[i] + "\t");						
						}
						System.out.println();
						System.out.println();
					} else if (selectNo2 == 3) {
						for (int i = 0; i < scores.length; i++) {
							if (scores[i] >= 90) {
								System.out.println("scores[" + i + "] : " + scores[i] + " - \"A\"");
							} else if (scores[i] >= 80) {
								System.out.println("scores[" + i + "] : " + scores[i] + " - \"B\"");
							} else if (scores[i] >= 70) {
								System.out.println("scores[" + i + "] : " + scores[i] + " - \"C\"");
							} else if (scores[i] >= 60) {
								System.out.println("scores[" + i + "] : " + scores[i] + " - \"D\"");
							} else {
								System.out.println("scores[" + i + "] : " + scores[i] + " - \"F\"");
							}
						}
						System.out.println();
					} else if (selectNo2 == 4) {
						run2 = false;
						break;
					}
				}
				System.out.println();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("종료");
	}
}
