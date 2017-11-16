package test;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * 1. 회원가입 2. 로그인 3. 종료
 */
public class HashTableExam {
	Map<String, String> map;
	Scanner scanner = new Scanner(System.in);
	String id;
	String pass;

	public HashTableExam() {
		map = new Hashtable<>();
	}

	void run() {
		AA: do {
			System.out.println("---------------------------------");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택 >> ");
			int check = scanner.nextInt();
			switch (check) {
			case 1:
				join();
				break;
			case 2:
				login();
				break;
			case 3:
				System.out.println("종료합니다.");
				break AA;
			}
		} while (true);
	}

	void join() {
		System.out.println("가입할 아이디와 패스워드를 입력하세요.");
		System.out.print("아이디 : ");
		id = scanner.next();
		if (map.containsKey(id)) {
			System.out.println("이미 사용 중인 아이디입니다.");
		} else {
			System.out.print("패스워드 : ");
			pass = scanner.next();
			map.put(id, pass);
		}
	}

	void login() {
		int cnt = 0;
		System.out.println("아이디와 패스워드를 입력하세요.");
		do {
			System.out.print("아이디 : ");
			id = scanner.next();
			if (!map.containsKey(id)) {
				System.out.println("아이디를 확인해주세요.");
			} else {
				break;
			}
		} while (true);
		do {
			System.out.print("패스워드 : ");
			pass = scanner.next();
			if (!map.get(id).equals(pass)) {
				++cnt;
				if (cnt < 5) {
					System.out.println("패스워드를 확인해주세요.");
					System.out.println("실패 횟수 : " + cnt);
				} else {
					System.out.println("실패 횟수 : " + cnt);
					System.out.println("패스워드 실패를 너무 많이해서 프로그램을 강제 종료합니다.");
					System.exit(0);
				}
			} else {
				System.out.println("로그인 성공");
				break;
			}
		} while (true);
	}

	public static void main(String[] args) {
		HashTableExam go = new HashTableExam();
		go.run();
	}
}
