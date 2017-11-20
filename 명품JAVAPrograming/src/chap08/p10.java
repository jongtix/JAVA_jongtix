package chap08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class p10 {
	public static void main(String[] args) throws Exception {
		HashMap<String, String> map = new HashMap<>();
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Documents\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp\\phone.txt"));
		Scanner scanner = new Scanner(System.in);
		String readLine = "";
		while ((readLine = reader.readLine()) != null) {
			String name = readLine.split(" ")[0].trim();
			String tel = readLine.split(" ")[1].trim();
			map.put(name, tel);
		}
		reader.close();
		
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			String m = it.next();
//			System.out.print(m + map.get(m));
//			System.out.println();
//		}
		System.out.println("총 " + map.size() + "개의 전화번호를 읽었습니다.");
		do {
			System.out.print("이름 >> ");
			String name = scanner.next();
			if (name.equals("그만")) break;
			if (!map.containsKey(name)) {
				System.out.println("찾는 이름이 없습니다.");
			} else {
				System.out.println(map.get(name));
			}
		} while (true);
	}
}
