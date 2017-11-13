package p02.clone;

import java.util.Objects;

/**
 * Objects의 requireNull()
 * */
public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1)); // requireNonNull(객체); 객체가 null이 아니면 객체의 내용 출력
		try {
			System.out.println(Objects.requireNonNull(str2)); //				   객체가 null이면 NullPointerException을 출력
		} catch (NullPointerException e) { //									   -> 회원가입 등에서 필수 입력 값이 없을 경우 주로 사용
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
