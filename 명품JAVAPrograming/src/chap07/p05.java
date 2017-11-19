package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class p05 {
	ArrayList<Student> student;
	Scanner scanner = new Scanner(System.in);
	String [] info = new String [4];
	
	p05() {
		student = new ArrayList<>();
	}
	
	void search() {
		do {
			System.out.print("학생 이름 >> ");
			String name = scanner.next();
			if (name.equals("그만")) {
				break;
			}
			for (int i = 0; i < student.size(); i++) {
				if (student.get(i).name.equals(name)) {
					System.out.println(student.get(i).name + ", " + student.get(i).major + ", " + student.get(i).number + ", " + student.get(i).avg);
				}
			}
		} while (true);
		
	}
	
	void show() {
		for (int i = 0; i < student.size(); i++) {
			System.out.println("이름 : " + student.get(i).name);
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
			student.add(s);
		}
		System.out.println("--------------------------------");
	}
	
	void run() {
		make();
		show();
		search();
	}
	
	public static void main(String[] args) {
		p05 go = new p05();
		go.run();
	}
}

class Student {
	String name;
	String major;
	int number;
	double avg;
}