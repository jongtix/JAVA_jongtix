package chap03;

import java.util.Scanner;

public class p14 {
	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner s = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.print("과목 이름>>");
			String str = s.next();
			if (str.equals(course[0])) {
				System.out.println(course[0] + "의 점수는 " + score[0]);
				isTrue = true;
			} else if (str.equals(course[1])) {
				System.out.println(course[1] + "의 점수는 " + score[1]);
				isTrue = true;
			} else if (str.equals(course[2])) {
				System.out.println(course[2] + "의 점수는 " + score[2]);
				isTrue = true;
			} else if (str.equals(course[3])) {
				System.out.println(course[3] + "의 점수는 " + score[3]);
				isTrue = true;
			} else if (str.equals(course[4])) {
				System.out.println(course[4] + "의 점수는 " + score[4]);
				isTrue = true;
			} else if (str.equals("그만")) {
				isTrue = false;
			} else {
				System.out.println("없는 과목입니다.");
				isTrue = true;
			}

		}

	}
}
