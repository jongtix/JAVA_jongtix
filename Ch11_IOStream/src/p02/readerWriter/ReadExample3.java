package p02.readerWriter;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		File f = new File("c:/temp/test.txt");
		Reader reader = new FileReader(f);
		int readCharNo;
		char[] cbuf = new char[4]; // 전체 배열
		readCharNo = reader.read(cbuf, 1, 2); // index 1부터 2 개의 char 데이터 출력
		for (int i = 0; i < cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	}
}
