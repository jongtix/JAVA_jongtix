package p06.strings;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123"; // 13자리 숫자 중 마지막 13번째 숫자를 check digit
									   // 앞 12자리의 값들이 산식에 의해 출력된 값이 13번째 값과 같아야함.
		
		char gender = ssn.charAt(ssn.indexOf("-") + 1); // 문자열 내의 특정 위치의 문자 하나를 추출하는 메소드
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		
		String str1 = new String("홍길동"); // 문자열 객체 생성
		String str2 = "홍길동"; // 문자열 리터럴
		if (str1 == str2) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}
		if (str1.equals(str2)) {
			System.out.println("같은 내용");
		} else {
			System.out.println("다른 내용");
		}
		
		String subj = "자바 프로그래밍";
		int location = subj.indexOf("프로그래밍");
		
		if (subj.indexOf("자바") != -1) { // 찾는 문자 패턴이 없으면 -1을 리턴
			System.out.println("자바와 관련이 있는 책이군요");
		} else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
		
		int length = ssn.length(); // 문자열의 길이 리턴
		if (length == 14) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 맞지 않습니다.");
		}
		
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		// 문자열 자르기
		ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		// 대소문자변경
		String sstr1 = "Java Programming";
		String sstr2 = "JAVA PROGRAMMING";
		System.out.println(sstr1.equals(sstr2)); // false
		String lowerstr1 = sstr1.toLowerCase(); // 소문자 변경
		String lowerstr2 = sstr2.toLowerCase(); // 이미 "java programming"이 상수풀에 저장되어 있기 때문에 새롭게 생성되지 않음
		System.out.println(lowerstr1.equals(lowerstr2)); // true
		System.out.println(sstr1.equalsIgnoreCase(sstr2)); // true // 대소문자 상관 없이 내용 비교
		
		// 문자열 공백 제거
		String tel1 = "    02";
		String tel2 = "1223    ";
		String tel3 = "     1234     ";
		String tel = tel1.trim() + "-" + tel2.trim() + "-" + tel3.trim();
		System.out.println(tel);
		
		// 기본 데이터 타입의 데이터를 문자열로 변경
		String val1 = String.valueOf(10); // int 10 -> 숫자형 문자열 "10"
		String val2 = String.valueOf(10.5); // double 10.5 -> 숫자형 문자열 "10.5"
		String val3 = String.valueOf(true); // boolean true -> 문자열 "true"
		System.out.println(val1 + " " + val1.length());
		System.out.println(val2 + " " + val2.length());
		System.out.println(val3 + " " + val3.length());
	}
}
