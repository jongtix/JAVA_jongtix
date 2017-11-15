package chpa07;

import java.util.HashMap;
import java.util.Scanner;

public class p05_2 {
	HashMap<String, Student> map;
	Scanner scanner = new Scanner(System.in);
	String [] info = new String [4];
	
	p05_2() {
		map = new HashMap<>();
	}
	
	void search() {
		
	}
	
	void show() {
		for (int i = 0; i < map.size(); i++) {
			System.out.println("이름 : " + map);
			System.out.println("학과 : " + student.get(i).major);
			System.out.println("학번 : " + student.get(i).number);
			System.out.println("학점평균 : " + student.get(i).avg);
			System.out.println("--------------------------------");
		}
	}
	
	void make() {
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String str = scanner.nextLine();
			info = str.split(", ");
			Student s = new Student();
			s.name = info[0];
			s.major = info[1];
			s.number = Integer.parseInt(info[2]);
			s.avg = Double.parseDouble(info[3]);
			map.put(s.name, s);
		}
		System.out.println("--------------------------------");
	}
	
	void run() {
		make();
		show();
		search();
	}
	
	public static void main(String[] args) {
		p05_2 s = new p05_2();
		s.run();
	}
}
