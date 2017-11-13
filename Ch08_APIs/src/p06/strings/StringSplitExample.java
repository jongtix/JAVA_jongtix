package p06.strings;

public class StringSplitExample {
	public static void main(String[] args) {
		String text = "홍길동&이수횽,일지매,김자바-이순신 정택근";
		String [] names = text.split("&|,|-| "); // split() 메소드는 매개변수로 받은 구분자를기준으로 토큰들을 축출함
		for (String name : names) {
			System.out.print(name + "\t");
		}
	}
}
