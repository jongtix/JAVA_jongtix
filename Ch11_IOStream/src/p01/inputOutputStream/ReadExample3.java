package p01.inputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/**
 * InputStream - byte단위 입력스트림
 * */
public class ReadExample3 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("c:/temp/test.txt");
			int readByteNo;
			byte [] readBytes = new byte[8];
			readByteNo = is.read(readBytes, 2, 3);
			for (int i = 0; i < readBytes.length; i++) {
				System.out.println((char) readBytes[i]);
			}
			is.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
