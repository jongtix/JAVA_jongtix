package chpa07;

import java.util.ArrayList;
import java.util.Scanner;

public class p02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("6 개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		ArrayList<Character> arrayList = new ArrayList<>();
		do {
			String str = scanner.next();
			if (str.charAt(0) != 0) {
				arrayList.add(str.charAt(0));
			}
			System.out.println(scanner.hasNext());
		} while (scanner.hasNext());
	}
}
