package p05.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * Thread-safe : 멀티 쓰레드 환경에서 자료를 보호할 수 있는 구조
 * */
public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		map.put("spring", "1234");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "1235");
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("아이디와 패스워드를 입력하세요.");
			System.out.print("아이디 : ");
			String id = scanner.next();
			System.out.print("패스워드 : ");
			String pass = scanner.next();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pass)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				System.out.println("입력한 아이디가 존재하지 않습니다.");
			}
		}
	}
}
