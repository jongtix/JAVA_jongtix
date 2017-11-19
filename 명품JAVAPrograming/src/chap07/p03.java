package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class p03 {
	HashMap<String, Integer> nations;
	Scanner scanner = new Scanner(System.in);
	String nation;
	int population;
	
	p03() {
		nations = new HashMap<>();
		
	}
	
	void find() {
		do {
			System.out.print("인구 검색 >> ");
			nation = scanner.next();
			if (nations.containsKey(nation)) {
				System.out.println(nation + "의 인구는 " + nations.get(nation));
				
			} else if (nation.equals("그만")) {
				System.exit(0);
			} else {
				System.out.println(nation + " 나라는 없습니다.");
			}
		} while (true);
	}
	
	void run() {
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		do {
			System.out.print("나라 이름, 인구 >> ");
			nation = scanner.next();
			if (nation.equals("그만")) {
				this.find();
			} else {
				population = scanner.nextInt();
				nations.put(nation, population);
			}
		} while (true);
	}
	
	public static void main(String[] args) {
		p03 go = new p03();
		go.run();
	}
}
