package p06.strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/일지매/임꺽정/이순신";
		
		// 객체 생성시 구분자를 기준으로 문자를 잘라서 저장.
		StringTokenizer str = new StringTokenizer(text, "/");
		int count = str.countTokens(); // 토큰화 된 문자열의 갯수 리턴
		for (int i = 0; i < count; i++) {
			System.out.println(str.nextToken());
		}
		System.out.println();
		
		// 더 많이 사용 (반복자처럼 사용)
		str = new StringTokenizer(text, "/");
		while (str.hasMoreTokens()) {
			String token = str.nextToken();
			System.out.println(token);
		}
	}
}
