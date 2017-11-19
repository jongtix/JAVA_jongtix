package chap07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class p08 {
	HashMap<String, Integer> map;
	Scanner scanner = new Scanner(System.in);
	
	void show() {
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print("(" + name + "," + map.get(name) + ")");
		}
		System.out.println();
	}
	
	void run() {
		System.out.println("** 포인트 관리 프로그램입니다. **");
		do {
			System.out.print("이름과 포인트 입력>> ");
			String st = scanner.nextLine();
			String name = st.split(" ")[0];
			if (name.equals("그만")) break;
			if (map.containsKey(name)) {
				int point = map.get(name);
				point += Integer.parseInt(st.split(" ")[1]);
				map.put(name, point);
			} else {
				int point = Integer.parseInt(st.split(" ")[1]);
				map.put(name, point);
			}
			show();
		} while (true);
	}
	
	p08() {
		map = new HashMap<>();
	}
	
	public static void main(String[] args) {
		p08 go = new p08();
		go.run();
	}
}
