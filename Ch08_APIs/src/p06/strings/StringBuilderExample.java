package p06.strings;

public class StringBuilderExample {
	public static void main(String[] args) {
		// 문자열 3개 만들어짐.("Java ", "Program study", "Java Program study")
		String str = "Java ";
		str += "Program study";
		System.out.println(str);
		
		// StringBuilder는 내부에 버퍼(배열과 비슷한 메모리 공간)가 있기 때문에 문자열이 하나만 만들어짐.
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Program study");
		System.out.println(sb.toString());
		// index위치 4에 문자열 "2"를 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		// index위치 4의 문자를 '6'으로 수정
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		// index위치 6 ~ 12를 "Book"으로 수정
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		// index위치 4 <=  < 5를 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자수 : " + length);
		
		String result = sb.toString();
		System.out.println(result);
	}
}
