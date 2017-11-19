package chap07;

import java.util.Scanner;
import java.util.Vector;

public class p12 {
	Vector<Word> vector;
	Scanner scanner = new Scanner(System.in);
	
	public p12() {
		vector = new Vector<>();
		
		vector.add(new Word("painting", "그림"));
		vector.add(new Word("love", "사랑"));
		vector.add(new Word("animal", "동물"));
		vector.add(new Word("bear", "곰"));
		vector.add(new Word("eye", "눈"));
		vector.add(new Word("picture", "사진"));
		vector.add(new Word("society", "사회"));
		vector.add(new Word("human", "인간"));
	}
	
	boolean check(String q, String a) {
		if (q.equals(a)) {
			return true;
		} else {
			return false;
		}
	}
	
	void run() {
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		do {
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
			int check = scanner.nextInt();
			switch (check) {
			case 1:
				test();
				System.out.println();
				break;
			case 2:
				input();
				System.out.println();
				break;
			case 3:
				System.out.println("\"명품영어\"를 종료합니다.");
				System.exit(0);
			}
		} while (true);
	}
	
	void input() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		do {
			System.out.print("영어 한글 입력 >> ");
			String eng = scanner.next();
			if (eng.equals("그만")) {
				break;
			}
			String kor = scanner.next();
			Word word = new Word(eng, kor);
			vector.addElement(word);
		} while (true);
	}
	
	void test() {
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + vector.size() + "개의 단어가 들어 있습니다.");
		do {
			int index = (int) (Math.random() * vector.size()); // vector에서 문제와 답의 위치
			System.out.println(vector.get(index).getWord() + "?");
			int [] quizNumber = { (int) (Math.random() * vector.size()), (int) (Math.random() * vector.size()), (int) (Math.random() * vector.size()), (int) (Math.random() * vector.size()) };
			int location = (int) (Math.random() * 4); // 정답 위치;
			quizNumber[location] = index;
			for (int i = 1; i < 5; i++) {
				System.out.print("(" + i + ")" + vector.get(quizNumber[i - 1]).getMeaning() + " ");
			}
			System.out.print(":> ");
			int answer = scanner.nextInt();
			if (answer == -1) {
				break;
			}
			
			if (check(vector.get(index).getMeaning(), vector.get(quizNumber[answer - 1]).getMeaning())) {
				System.out.println("Excellent !!");
			} else {
				System.out.println("No. !!");
			}
		} while (true);
	}
	
	public static void main(String[] args) {
		p12 op = new p12();
		op.run();
	}
}