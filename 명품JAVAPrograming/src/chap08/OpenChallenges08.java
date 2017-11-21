package chap08;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class OpenChallenges08 {
	Scanner scanner;
	File file = new File("C:\\Users\\Administrator\\Documents\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp\\words.txt");
	Vector<String> words = new Vector<>();
	HashMap<String, Integer> map = new HashMap<>();
	Set<Integer> set = new HashSet<>();
	String string;
	String [] strings;
	int count = 0;
	
	public OpenChallenges08() throws Exception {
		scanner = new Scanner(new FileReader(file));
		while (scanner.hasNext()) {
			String word = scanner.nextLine();
			words.add(word);
		}
		scanner = new Scanner(System.in);
	}
	
	void selectWord() {
		int randomIndex = (int) (Math.random() * words.size());
		string = words.get(randomIndex);
		strings = string.split("");
	}
	
	void random() {
		int i = (int) (Math.random() * strings.length);
		while(set.size() < 2) {
			set.add(i);
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int index = it.next();
			map.put(strings[index], index);
		}
	}
	
	void show() {
		for (int i = 0; i < strings.length; i++) {
			if (set.contains(i)) {
				System.out.print("-");
			} else {
				System.out.print(strings[i]);
			}
		}
	}
	
	void run() {
		selectWord();
		random();
		do {
			show();
			check();
		} while (true);
	}

	void check() {
		System.out.print(">>");
		String ans = scanner.next();
		if (map.containsKey(ans)) {
			set.remove(map.get(ans));
		} else {
			count++;
		}
		if (count >= 5) {
			System.out.println("5번 실패하였습니다.");
			count = 0;
			set.clear();
			show();
		}
	}

	public static void main(String[] args) throws Exception {
		OpenChallenges08 game = new OpenChallenges08();
		game.run();
	}
}
