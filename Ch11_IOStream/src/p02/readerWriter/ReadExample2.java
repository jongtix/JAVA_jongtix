package p02.readerWriter;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("c:/temp/test.txt");
			int readCharNo;
			char [] cbuf = new char[2];
			String data = "";
			while (true) {
				readCharNo = reader.read(cbuf);
				if (readCharNo == -1) break;
				data += new String(cbuf, 0, readCharNo);
			}
			System.out.println(data);
			reader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
