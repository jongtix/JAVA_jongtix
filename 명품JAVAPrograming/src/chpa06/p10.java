package chpa06;

import java.util.Scanner;

public class p10 {
	static Scanner scanner = new Scanner(System.in);
	Person [] person = new Person[2];
	
	public static void main(String[] args) {
		p10 game = new p10();
		game.setting();
		game.run();
	}
	
	public void setting() {
		System.out.print("1번째 선수 이름>>");
		String name = scanner.next();
		Person person1 = new Person(name);
		System.out.print("2번째 선수 이름>>");
		name = scanner.next();
		Person person2 = new Person(name);
		person[0] = person1;
		person[1] = person2;
	}
	
	public void run() {
		int i = 0;
		scanner.nextLine();
		do {
			System.out.println("[" + person[i % 2].getName() + "]:<Enter>");
			scanner.nextLine();
			int f = (int) (Math.random()*3 + 1);
			int s = (int) (Math.random()*3 + 1);
			int t = (int) (Math.random()*3 + 1);
			System.out.print(f + "\t" + s + "\t" + t);
			if (f == s && s == t) {
				System.out.println(person[i % 2].getName() + "님이 이겼습니다!");
				break;
			} else {
				System.out.println("아쉽군요!");
			}
			System.out.println();
			i++;
		} while (true);
	}
}

class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}