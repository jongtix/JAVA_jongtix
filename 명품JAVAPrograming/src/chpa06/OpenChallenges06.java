package chpa06;

import java.util.Scanner;

public class OpenChallenges06 {
	public static void main(String[] args) {
		OpenChallenges06 start = new OpenChallenges06();
		start.run();
	}
	
	void run() {
		int [] array = new int[26];
		for (int i : array) {
			i = 0;
		}
		System.out.println("영문 텍스트를입력하고 세미콜론을 입력하세요.");
		String str = this.readString();
		str = str.trim();
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				int index = c - 'A';
				array[index] += 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print((char)('A' + i));
			for (int j = 0; j < array[i]; j++) {
				System.out.print('-');
			}
			System.out.println();
		}
	}
	
	String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String line = scanner.nextLine();
			if (line.length() == 1 && line.charAt(0) == ';') {
				break;
			}
			sb.append(line);
		}
		return sb.toString();
	}
}
