package test;
/**
 * 회원가입 
 *  id:5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다
 *  password:6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.
 *  name:5자이하 한글
 * */
import java.util.Scanner;
import java.util.regex.Pattern;

public class MemberExample {
	public static void main(String[] args) {
		String id;
		String password;
		String name;
		
		System.out.println("회원가입 하시겠습니까?");
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("ID>>");
			id = scanner.next();
			String idCheck = "[a-z|\\d|_|-]{5,20}";
			boolean result = Pattern.matches(idCheck, id);
			if (!result) {
				System.out.println("아이디는 5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.");
			} else {
				break;
			}
		} while (true);
		do {
			System.out.println("Password>>");
			password = scanner.next();
			String passwordCheck = "[\\w|\\W]{6,16}";
			boolean result = Pattern.matches(passwordCheck, password);
			if (!result) {
				System.out.println("패스워드는 6~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
			} else {
				break;
			}
		} while (true);
		do {
			System.out.println("Name>>");
			name = scanner.next();
			String nameCheck = "[가-휗]{1,5}";
			boolean result = Pattern.matches(nameCheck, name);
			if (!result) {
				System.out.println("이름은 5자 이하까지 입력 가능합니다.");
			} else {
				break;
			}
		} while (true);
		
		Member member = new Member(id, password, name);
		System.out.println("가입완료");
		System.out.println(member);
	}
}
