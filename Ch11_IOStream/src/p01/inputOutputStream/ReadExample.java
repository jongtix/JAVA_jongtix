package p01.inputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * InputStream - byte 단위의 데이터 입출력
 * */
public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/temp/test.txt");
			int readByte;
			while (true) {
				readByte = is.read(); // 1 byte를 읽어서 리턴
				if (readByte == -1) break;
				System.out.println((char) readByte);
			}
			is.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
