package chap22;

public class StringTest1 {
	public static void main(String[] args) {
		String str = "       Hello World!      ";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
	}
}
