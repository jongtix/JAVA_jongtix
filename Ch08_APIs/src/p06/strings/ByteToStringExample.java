package p06.strings;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte [] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		// String 클래스의 생성자 String(값)
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}
}
