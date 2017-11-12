package chpa06;

import java.util.Calendar;
import java.util.Scanner;

public class p06 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		p06 game = new p06();
		game.run();
	}

	void run() {
		int player1sec1 = 0;
		int player1sec2 = 0;
		int player2sec1 = 0;
		int player2sec2 = 0;
		int result1;
		int result2;
		String winner;
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("황기태 시작 <Enter>키>>");
		scanner.nextLine();
		Calendar today = Calendar.getInstance();
		player1sec1 = today.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + player1sec1);
		System.out.print("10초 예상 후 <Enter>키>>");
		scanner.nextLine();
		today = Calendar.getInstance();
		player1sec2 = today.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + player1sec2);
		result1 = player1sec2 - player1sec1;
		System.out.println();
		
		System.out.print("이재문 시작 <Enter>키>>");
		scanner.nextLine();
		today = Calendar.getInstance();
		player2sec1 = today.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + player2sec1);
		System.out.print("10초 예상 후 <Enter>키>>");
		scanner.nextLine();
		today = Calendar.getInstance();
		player2sec2 = today.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + player2sec2);
		result2 = player2sec2 - player2sec1;
		
		if (result1 < 0) {
			result1 += 60;
		}
		if (result2 < 0) {
			result2 += 60;
		}
		if (Math.abs(result1 - 10) > Math.abs(result2 - 10)) {
			winner = "승자는 이재문";
		} else if (Math.abs(result1 - 10) < Math.abs(result2 - 10)) {
			winner = "승자는 황기태";
		} else {
			winner = "비겼습니다.";
		}
		System.out.println();
		System.out.println("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", " + winner);
	}
}
