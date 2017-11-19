package chap07;

import java.util.Scanner;
import java.util.Vector;

public class p11 {
	Vector<Nation> nation;
	Scanner scanner = new Scanner(System.in);

	p11() {
		nation = new Vector<>(0);
	}

	void insert() {
		if (nation.size() != 0) {
			System.out.println("현재 " + nation.size() + "개 나라의 수도가 입력되어 있습니다.");
			do {
				System.out.print("나라와 수도 입력 " + (nation.size() + 1) + " >> ");
				String str = scanner.nextLine();
				String country = str.split(" ")[0];
				if (country.equals("그만")) {
					break;
				}
				String capital = str.split(" ")[1];
				while (nation.iterator().hasNext()) {
					if (nation.iterator().next().getCountry().equals(country)) {
						System.out.println(country + "는 이미 있습니다!");
					}
				}
				Nation n = new Nation(country, capital);
				nation.add(n);
				System.out.println(nation.size());
			} while (true);
		} else {
			System.out.println("현재 입력되어 있는 나라가 없습니다.");
			System.out.print("나라와 수도 입력 1 >> ");
			String str = scanner.nextLine();
			String country = str.split(" ")[0];
			String capital = str.split(" ")[1];
			Nation n = new Nation(country, capital);
			nation.add(n);
		}
	}

	void quiz() {
		do {
			int ran = (int) (Math.random() * nation.size());
			System.out.print(nation.get(ran).getCountry() + "의 수도는? ");
			String a = scanner.next();
			if (a.equals("그만"))
				break;
			if (nation.get(ran).getCapital().equals(a)) {
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
		p11 go = new p11();
		go.run();
	}
}

class Nation {
	private String country;
	private String capital;

	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

}