package test;

import java.util.Scanner;

public class MemberServiceExample {
	static Member[] memberArray = new Member[100];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 객체 생성
		boolean isTrue = true;
		do {
			System.out.println("아이디와 패스워드를 입력하세요.");
			System.out.println("아이디>>");
			String id = scanner.next();
			System.out.println("패스워드>>");
			String password = scanner.next();
			Member member = findMember(id, password);
			if (member == null) {
				System.out.println("회원 정보가 없습니다. 회원가입하세요.");
				System.out.println("아이디>>");
				id = scanner.next();
				System.out.println("패스워드>>");
				password = scanner.next();
				System.out.println("회원이름>>");
				String name = scanner.next();
				member = new Member(id, password, name);
				for (int i = 0; i < memberArray.length; i++) {
					if (memberArray[i] == null) {
						memberArray[i] = member;
						System.out.println("회원가입성공");
						break;
					}
				}
			} else {
				System.out.println(member.getName() + "님 로그인 환영합니다.");
				isTrue = false;
			}
		} while (isTrue);
	}

	private static Member findMember(String id, String password) {
		Member member = null;
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] != null) {
				if (memberArray[i].getId().equals(id) && memberArray[i].getPassword().equals(password)) {
					member = memberArray[i];
				} else {
					member = null;
				}
			}
		}
		return member;
	}
}
