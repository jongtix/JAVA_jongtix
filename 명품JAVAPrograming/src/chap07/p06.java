package chap07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class p06 {
	HashMap<String, Location> map;
	Set<String> keys;
	Iterator<String> it;
	Scanner scanner = new Scanner(System.in);
	String [] info = new String[3];
	
	p06() {
		map = new HashMap<String, Location>();
	}
	
	void search() {
		do {
			System.out.print("도시 이름 >> ");
			String name = scanner.next();
			if (name.equals("그만")) {
				break;
			}
			if (!keys.contains(name)) {
				System.out.println(name + "는 없습니다.");
			} else {
				System.out.println(map.get(name).nation + "\t" + map.get(name).x + "\t" + map.get(name).y);
			}
		} while (true);
	}
	
	void show() {
		keys = map.keySet();
		it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(map.get(name).nation + "\t" + map.get(name).x + "\t" + map.get(name).y);
		}
		System.out.println("---------------------------------------");
	}
	
	void make() {
		System.out.println("도시, 경도, 위도를 입력하세요.");
		do {
			System.out.print(">> ");
			String str = scanner.nextLine();
			info = str.split(", ");
			Location location = new Location(info[0], Long.parseLong(info[1]), Long.parseLong(info[2]));
			map.put(info[0], location);
		} while (map.size() < 4);
		System.out.println("---------------------------------------");
	}
	
	void run() {
		make();
		show();
		search();
	}

	public static void main(String[] args) {
		p06 go = new p06();
		go.run();
	}
}

class Location {
	String nation;
	long x;
	long y;
	
	public Location(String nation, long x, long y) {
		super();
		this.nation = nation;
		this.x = x;
		this.y = y;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public long getX() {
		return x;
	}

	public void setX(long x) {
		this.x = x;
	}

	public long getY() {
		return y;
	}

	public void setY(long y) {
		this.y = y;
	}
}