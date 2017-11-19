package chap08;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class p02 {
	public static void main(String[] args) throws Exception {
		File f = new File("H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp\\phone.txt");
		Reader reader = new FileReader(f);
		char [] cbuf = new char [20];
		String data = "";
		
		int readData;
		while ((readData = reader.read(cbuf)) != -1) {
			data += new String(cbuf, 0, readData);
		}
		System.out.println(data);
		reader.close();
	}
}
