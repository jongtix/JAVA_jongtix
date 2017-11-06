package chap04;

import java.util.Scanner;

public class MonthSchedule {
	static Day[] days;
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
	
	MonthSchedule(int day) {
		days = new Day[day - 1];
	}
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜(1~30)?");
		int i = (scanner.nextInt() - 1);
		System.out.println("할일(빈칸없이입력)?");
		String work = scanner.next();
		if (days[i] != null) {
			days[i].set(work);			
		} else {
			System.out.println((i + 1) + "일에는 이미 할 일이 있습니다.");
		}
	}
	
	void view() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜(1~30)?");
		int i = (scanner.nextInt() - 1);
		if (days[i] != null) {
			System.out.println(i + "일의 할 일은 ");
			days[i].show();			
		}
	}
	
	void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	void run() {
		Day[] newDay;
		int check = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이번달 스케쥴 관리 프로그램.");
		do {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
			check = scanner.nextInt();
			switch (check) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:
				break;
			}			
		} while (check == 3);
	}
}

class Day {
	private String work;
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if (work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}