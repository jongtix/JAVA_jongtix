package chap07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class p05_2 {
	HashMap<String, Student> map;
	Set<String> keys;
	Iterator<String> it;
	Scanner scanner = new Scanner(System.in);
	String [] info = new String [4];
	
	p05_2() {
		map = new HashMap<>();
	}
	
	void search() {
		do {
			System.out.print("학생 이름 >> ");
			String name = scanner.next();
			if (name.equals("그만")) {
				break;
			} else if (map.get(name) == null) {
				
			} else {
				System.out.println(map.get(name).name + ", " + map.get(name).major + ", " + map.get(name).number + ", " + map.get(name).avg);
			}
		} while (true);
	}
	
	void show() {
		keys = map.keySet();
		it = keys.iterator();
		
		while (it.hasNext()) {
			String name = it.next();
			System.out.println("이름 : " + map.get(name).name);
			System.out.println("학과 : " + map.get(name).major);
			System.out.println("학번 : " + map.get(name).number);
			System.out.println("학점평균 : " + map.get(name).avg);
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
