package chap07;

import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class OpenChallenges07 {
	Vector<Word> vector;
	Scanner scanner = new Scanner(System.in);
	
	public OpenChallenges07() {
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
				System.out.println("\"명품영어\"를 종료합니다...");
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
		OpenChallenges07 op = new OpenChallenges07();
		op.run();
	}
}

class Word {
	private String word;
	private String meaning;
	
	public Word(String word, String meaning) {
		this.word = word;
		this.meaning = meaning;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
}