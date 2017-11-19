package chap07;

import java.util.Scanner;
import java.util.Vector;

public class p04 {
	Vector<Integer> rains;
	int rain;
	Scanner scanner = new Scanner(System.in);
	p04() {
		rains = new Vector<>();
	}
	
	void run() {
		do {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			rain = scanner.nextInt();
			if (rain == 0) {
				break;
			}
			rains.add(rain);
			for (int i = 0; i < rains.size(); i++) {
				System.out.print(rains.get(i) + " ");
			}
			System.out.println();
			int sum = 0;
			for (int i = 0; i < rains.size(); i++) {
				sum += rains.get(i);
			}
			System.out.print("현재 평균 " + ((double) sum / (double) rains.size()));
			System.out.println();
		} while (true);
		System.exit(0);
	}
	
	public static void main(String[] args) {
		p04 go = new p04();
		go.run();
	}
}
