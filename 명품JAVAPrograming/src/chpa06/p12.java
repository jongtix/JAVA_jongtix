package chpa06;

import java.util.Scanner;

public class p12 {
	static Scanner scanner = new Scanner(System.in);
	Person [] person;
	
	public static void main(String[] args) {
		p12 game = new p12();
		game.setting();
		game.run();
	}
	
	public void setting() {
		System.out.println("겜블링 게임에 참여할 선수 숫자>>");
		int numberOfPlayer = scanner.nextInt();
		person = new Person[numberOfPlayer];
		for (int i = 0; i < numberOfPlayer; i++) {
			System.out.print((i + 1) + "번째 선수 이름>>");
			String name = scanner.next();
			person[i] = new Person(name);
		}
	}
	
	public void run() {
		int i = 0;
		scanner.nextLine();
		do {
			int number = person.length;
			System.out.println("[" + person[i % number].getName() + "]:<Enter>");
			scanner.nextLine();
			int f = (int) (Math.random()*3 + 1);
			int s = (int) (Math.random()*3 + 1);
			int t = (int) (Math.random()*3 + 1);
			System.out.print(f + "\t" + s + "\t" + t + "\t");
			if (f == s && s == t) {
				System.out.println(person[i % number].getName() + "님이 이겼습니다!");
				break;
			} else {
				System.out.println("아쉽군요!");
			}
			System.out.println();
			i++;
		} while (true);
	}
}

//class Person {
//	String name;
//	
//	Person(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//}