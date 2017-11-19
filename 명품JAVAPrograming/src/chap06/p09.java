package chap06;

import java.util.Scanner;

public class p09 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		p09 game = new p09();
		game.run();
	}

	public String toString(int i) {
		if (i == 1) {
			return "가위";
		} else if (i == 2) {
			return "바위";
		} else if (i == 3) {
			return "보";
		} else {
			return "0";
		}
	}

	void run() {
		String winner = "";
		while (true) {
			System.out.println("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			int user = scanner.nextInt();
			int com = (int) (Math.random() * 3 + 1);
			if (user == 4) {
				System.exit(0);
			}
			if (user == com) {
				System.out.println("철수(" + this.toString(user) + ") : 컴퓨터(" + this.toString(com) + ")");
				System.out.println("비겼습니다.");
			} else {
				switch (user) {
				case 1:
					if (com == 2) {
						winner = "컴퓨터";
					} else {
						winner = "철수";
					}
					break;
				case 2:
					if (com == 1) {
						winner = "철수";
					} else {
						winner = "컴퓨터";
					}
					break;
				case 3:
					if (com == 1) {
						winner = "컴퓨터";
					} else if (com == 2) {
						winner = "철수";
					}
					break;
				}
				System.out.println("철수(" + this.toString(user) + ") : 컴퓨터(" + this.toString(com) + ")");
				System.out.println(winner + "가 이겼습니다.");
			}
		}
	}
}
