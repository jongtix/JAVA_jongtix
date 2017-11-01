package chap02;

import java.util.Scanner;

public class OpenChallengs02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		str1 = s.next();
		System.out.print("영희 >> ");
		str2 = s.next();

		if (str1.equals("가위")) {
			if (str2.equals("가위")) System.out.println("비겼습니다.");
			if (str2.equals("바위")) System.out.println("영희가 이겼습니다.");
			if (str2.equals("보")) System.out.println("철수가 이겼습니다.");
		} else if (str1.equals("바위")) {
			if (str2.equals("가위")) System.out.println("철수가 이겼습니다.");
			if (str2.equals("바위")) System.out.println("비겼습니다.");
			if (str2.equals("보")) System.out.println("영희가 이겼습니다.");
		} else if (str1.equals("보")) {
			if (str2.equals("가위")) System.out.println("영희가 이겼습니다.");
			if (str2.equals("바위")) System.out.println("철수가 이겼습니다.");
			if (str2.equals("보")) System.out.println("비겼습니다.");
		}
	}
}
