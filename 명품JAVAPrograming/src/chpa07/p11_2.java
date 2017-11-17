package chpa07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class p11_2 {
	HashMap<String, String> map;
	Scanner scanner = new Scanner(System.in);
	
	public p11_2() {
		map = new HashMap<>();
		Nation nn = new Nation("한국", "서울");
		map.put(nn.getCountry(), nn.getCapital());
	}
	
	void insert() {
		System.out.println("현재 " + map.size() + "개 나라의 수도가 입력되어 있습니다.");
		do {
			System.out.println("나라와 수도 입력 " + (map.size() + 1) + " >> ");
			String str = scanner.nextLine();
			for (String st : str.split(" ")) {
				System.out.println(st);
			}
			String country = str.split(" ")[0];
			if (country.equals("그만")) {
				break;
			}
			String capital = str.split(" ")[0];
			Set<String> set = map.keySet();
			while (set.iterator().hasNext()) {
				if (set.iterator().next().equals(country)) {
					System.out.println(country + "는 이미 있습니다.");
				}
			}
			Nation n = new Nation(country, capital);
			map.put(country, capital);
		} while (true);
	}
	
	void quiz() {
		do {
			int ran = (int) (Math.random() * map.size());
			Set<String> set = map.keySet();
			String [] str = (String []) set.toArray();
			System.out.print(str[ran] + "의 수도는? ");
			String a = scanner.next();
			if (a.equals("그만")) {
				break;
			}
			if (map.get(str[ran]).equals(a)) {
				System.out.println("정답!!");
			} else {
				System.out.println("아닙니다!!");
			}
		} while (true);
	}
	
	void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		AA: do {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				insert();
				break;
			case 2:
				quiz();
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				break AA;
			}
		} while (true);
	}
	
	public static void main(String[] args) {
		p11_2 go = new p11_2();
		go.run();
	}
}
