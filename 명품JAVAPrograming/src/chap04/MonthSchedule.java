package chap04;

import java.util.Scanner;

public class MonthSchedule {
	private int nDay;
	private Day[] days;
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
	
	MonthSchedule(int nDay) {
		days = new Day[nDay];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
	}
	
	void input() {
		System.out.println("날짜(1~30)?");
		int i = (scanner.nextInt() - 1);
		if (i < 0 || i > 30) {
			System.out.println("날짜를 확인해주세요.");
		} else {
			System.out.println("할일(빈칸없이입력)?");
			String work = scanner.next();
			days[i].set(work);						
		}
	}
	
	void view() {
		System.out.println("날짜(1~30)?");
		int i = (scanner.nextInt() - 1);
		System.out.print((i + 1) + "일의 할 일은 ");
		days[i].show();
	}
	
	void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	void run() {
		int check = 0;
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while (check != 3) {
			System.out.println("할일(입력:1, 보기:2, 끝내기:3) >>");
			check = scanner.nextInt();
			switch (check) {
			case 1:
				input();
				System.out.println();
				continue;
			case 2:
				view();
				System.out.println();
				continue;
			case 3:
				finish();
				System.out.println();
				continue;
			}			
		}
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