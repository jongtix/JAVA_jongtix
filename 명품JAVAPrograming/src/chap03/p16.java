package chap03;

import java.util.Scanner;

public class p16 {
	public static void main(String[] args) {
		String[] str = { "가위", "바위", "보" };
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		Scanner scanner = new Scanner(System.in);
		boolean isTrue = true;
		while (isTrue) {
			System.out.print("가위 바위 보!>>");
			String client = scanner.next();
			int num = (int) (Math.random() * 3);
			if (str[num].equals("가위")) {
				switch (client) {
				case "가위":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 비겼습니다.");
					break;
				case "바위":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 사용자가 이겼습니다..");
					break;
				case "보":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 컴퓨터가 이겼습니다.");
					break;
				}
			} else if (str[num].equals("바위")) {
				switch (client) {
				case "가위":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 컴퓨터가 이겼습니다.");
					break;
				case "바위":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 비겼습니다..");
					break;
				case "보":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 사용자가 이겼습니다.");
					break;
				}
			} else if (str[num].equals("보")) {
				switch (client) {
				case "가위":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 사용자가 이겼습니다.");
					break;
				case "바위":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 컴퓨터가 이겼습니다..");
					break;
				case "보":
					System.out.println("사용자 = " + client + ", 컴퓨터 = " + str[num] + ", 비겼습니다.");
					break;
				}
			} else if (client == "그만") {
				System.out.println("게임을 종료합니다...");
				isTrue = false;
			}
		}
	}
}
