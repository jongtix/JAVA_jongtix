package p07.regularExperension;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010) - \\d{3,4} - \\d{4}";
		// () 그룹핑, \뒤에 특수문자 -> \ + \d : 숫자 하나
		// { 3, 4 } -> { m, n } 최소 m개 최대 n개
		// \d{4} 정확히 4개
		String data = "010 - 12354 - 4567";

		boolean result = Pattern.matches(regExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 불일치합니다.");
		}

		// 정규식을 사용하지 않는 방법
		String str1 = data.substring(0, data.indexOf(" - "));
		String str2 = data.substring(data.indexOf(" - ") + 3, data.lastIndexOf(" - "));
		String str3 = data.substring(data.lastIndexOf(" - ") + 3);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		result = false;
		if (str1.length() >= 2 && str1.length() <= 3) {
			if (str2.length() >= 3 && str2.length() <= 4) {
				if (str3.length() == 4) {
					result = true;
				}
			}
		}
		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 불일치합니다.");
		}
	}
}
