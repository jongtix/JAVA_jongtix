package p06.strings;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		byte [] bytes = new byte[100];
		
		System.out.print("입력 : ");
		try {
			int readByteNo = System.in.read(bytes); // read(배열) - 값을 읽어서 배열에 저장 후 읽은 값의 길이를 readByteNo에 대입
			
			String str = new String(bytes, 0, readByteNo - 2); //readByteNo - 2 : 키보드에 값을 입력 후 엔터키를 치면 CR, LF키가 입력되기 때문에
			
			System.out.println(str);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
