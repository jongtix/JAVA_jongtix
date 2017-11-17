package p02.readerWriter;

import java.io.FileReader;
import java.io.Reader;

/**
 * 문자 단위의 입출력 스트림 - Reader/Writer
 * */
public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("c:/temp/test.txt");
			int readData;
			while (true) {
				readData = reader.read(); // char -> int에 저장
				if (readData == -1) break;
				System.out.println((char) readData); // int -> char로 변환 출력
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
