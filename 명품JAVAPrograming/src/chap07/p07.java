package chap07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class p07 {
	HashMap<Double, String> map;
	Scanner scanner = new Scanner(System.in);
	
	p07() {
		map = new HashMap<>();
	}
	
	void search() {
		System.out.print("장학생 선발학점 기준 입력>> ");
		double number = scanner.nextDouble();
		Set<Double> keys = map.keySet();
		Iterator<Double> it = keys.iterator();
		System.out.print("장학생 명단 : ");
		while (it.hasNext()) {
			double d = it.next();
			if (d >= number) {
				System.out.print(map.get(d) + " ");
			}
		}
	}
	
	void make() {
		do {
			System.out.print("이름과 학점>> ");
			String str = scanner.nextLine();
			String name = str.split(" ")[0];
			double score = Double.parseDouble(str.split(" ")[1]);
			map.put(score, name);
		} while (map.size() < 5);
	}
	
	void run() {
		System.out.println("미래장학금관리시스템입니다.");
		make();
		search();
	}
	
	public static void main(String[] args) {
		p07 go = new p07();
		go.run();
	}
}
