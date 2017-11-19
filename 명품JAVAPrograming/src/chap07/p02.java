package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class p02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("6 개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		ArrayList<Character> arrayList = new ArrayList<>();
		String str = scanner.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				arrayList.add(str.charAt(i));				
			}
		}
		double [] scores = new double[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			char grade = arrayList.get(i);
			switch (grade) {
			case 'A':
				scores[i] = 4.0;
				break;
			case 'B':
				scores[i] = 3.0;
				break;
			case 'C':
				scores[i] = 2.0;
				break;
			case 'D':
				scores[i] = 1.0;
				break;
			case 'F':
				scores[i] = 0.0;
				break;
			}
		}
		double sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			sum += scores[i];
		}
		System.out.println(sum / (double) arrayList.size());
	}
}
