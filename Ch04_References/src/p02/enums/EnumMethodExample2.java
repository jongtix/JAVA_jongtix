package p02.enums;

import java.util.Scanner;

public class EnumMethodExample2 {
	public static void main(String[] args) {
		System.out.println("성별을 입력하세요.");
		Gender gender = null;
		Scanner scanner = new Scanner(System.in);
		
		//남성이면 "남성입니다.", 여성이면 "여성입니다." 출력
		String str = scanner.next();
		if (str.equals("남성")) {
			gender = Gender.valueOf("MALE");			
		} else if (str.equals("여성")) {
			gender = Gender.valueOf("FEMALE");
		} else {
			gender = Gender.valueOf(str);
		}
		//열거형.valueOf(문자열) => 입력한 문자열을 열거상수로 변환하는 메소드
		if (gender == Gender.MALE) {
			System.out.println("남성입니다.");
		} else if (gender == Gender.FEMALE) {
			System.out.println("여성입니다.");
		}
	}
}
