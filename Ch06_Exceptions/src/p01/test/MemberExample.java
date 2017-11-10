package p01.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MemberExample {
	static Member[] member = new Member[0];
	static int cnt;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 회원가입, 로그인 처리
		 * id체크 - id가 다르면 NoMemberException(); 회원가입 처리
		 * password체크 - password가 다르면 NoMatchPassword();
		 * 패스워드 5회 입력까지 성공 못하면 자동 종료 System.exit(0);
		 * 둘 다 맞으면 로그인 성공 메시지 출력
		 */
		cnt = 0;
		try {
			do {
				System.out.println("---------------------------------");
				System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
				System.out.println("---------------------------------");
				System.out.print("입력 >> ");
				int check = scanner.nextInt();
				switch (check) {
				case 1:
					cnt++;
					Member [] temp = new Member[cnt - 1];
					System.arraycopy(member, 0, temp, 0, member.length);
					member = new Member[cnt];
					join();
					break;
				case 2:
					login();
					break;
				case 3:
					break;
				}
			} while (true);

		} catch (NoMemberException e) {
			e.getMessage();
		} catch (NoMatchPassword e) {
			e.getMessage();
		} catch (NullPointerException e) {
			e.getMessage();
		}
	}

	static void join() {
		System.out.print("Id 입력: ");
		if (member[cnt - 1].getId() == null) {
			System.out.println("as;ldkfj");
			member[cnt - 1].setId(scanner.next());
		}
		System.out.print("Password 입력: ");
		if (member[cnt - 1].getPassword() == null) {
			member[cnt - 1].setPassword(scanner.next());
		}
		System.out.print("이름 입력: ");
		if (member[cnt - 1].getName() == null) {
			member[cnt - 1].setName(scanner.next());
		}
	}

	static void login() throws NoMemberException, NoMatchPassword {
		System.out.print("Id 입력: ");
		String inputId = scanner.next();
		for (int i = 0; i < member.length; i++) {
			if (!member[i].getId().equals(inputId)) {
				throw new NoMemberException();
			}
		}
		System.out.print("Password 입력: ");
		if (member[Arrays.asList(member).indexOf(inputId)].getPassword().equals(scanner.next())) {
			System.out.println("로그인 성공");
		} else {
			throw new NoMatchPassword();
		}
			
		
	}
}

class NoMemberException extends Exception {
	@Override
	public String getMessage() {
		return "회원 정보가 없습니다. 회원가입하세요.";
	}
}

class NoMatchPassword extends Exception {
	@Override
	public String getMessage() {
		return "비밀번호가 다릅니다.";
	}
}