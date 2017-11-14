package chpa07;

import java.util.Scanner;
import java.util.Vector;

public class p01 {
	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수(-1이 입력될 때까지)>>");
		int number;
		do {
			number = scanner.nextInt();
			if (number == -1) {
				break;
			}
			vec.add(number);
		} while (true);
		vec.sort(null);
		System.out.println("가장 큰 수는 " + vec.get(vec.size() - 1));
	}
}
