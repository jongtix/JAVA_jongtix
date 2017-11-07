package chap04;

import java.util.Arrays;
import java.util.Scanner;

public class DicApp {
	static Scanner scanner = new Scanner(System.in);
	static String str;
	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		do {
			System.out.print("한글 단어?");
			str = scanner.next();
			if (str.equals("그만")) { 
				break;
			} else if (Dictionary.kor2Eng(str) != str) {
				System.out.println(str + "은 " + Dictionary.kor2Eng(str));				
			} else {
				System.out.println(str + "은 저의 사전에 없습니다.");
			}
		} while (true);
	}
}

class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		int i = 0;
		String engStr;
		if (Arrays.asList(kor).contains(word)) {
			i = Arrays.asList(kor).indexOf(word);
			engStr = eng[i];
			return engStr;
		} else {
			return word;
		}
	};
}