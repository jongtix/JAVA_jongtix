package chap04;

import java.util.Scanner;

public class OpenChallenges04 {
	private Scanner scanner;
	private String startWord = "아버지";
	private Player [] player;
	
	public OpenChallenges04() {
		scanner = new Scanner(System.in);
	}
	
	// 게임 참가자 수를 입력받고 Player []을 생성하는 메소드
	private void creatPlayer() {
		System.out.println("게임에 참가하는 인원은 몇명입니까>>");
		int number = scanner.nextInt();
		player = new Player[number];
		for (int i = 0; i < number; i++) {
			System.out.println("참가자의 이름을 입력하세요>>");
			String name = scanner.next();
			player[i] = new Player(name);
		}
	}
	// 게임을 진행하는 메소드
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		creatPlayer();
		System.out.println("시작하는 단어는 " + startWord + "입니다");
		String word = startWord;
		int n = 0;
		while(true) {
			int lastIndex = word.length() - 1;
			char lastChar = word.charAt(lastIndex);
			word = player[n].getWordFromUser();
			if (player[n].checkSuccess(lastChar)) {
				n++;
				n = n % player.length;
			} else {
				System.out.println(player[n].getName() + "이 졌습니다.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		OpenChallenges04 game = new OpenChallenges04();
		game.run();
	}
}

class Player {
	private Scanner scanner;
	private String name;
	private String word;
	
	public Player(String name) {
		scanner = new Scanner(System.in);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getWordFromUser() {
		System.out.println(name + ">>");
		word = scanner.next();
		return word;
	}
	public boolean checkSuccess(char lastChar) {
		if (lastChar == word.charAt(0)) {
			return true;			
		} else {
			return false;
		}
	}
}