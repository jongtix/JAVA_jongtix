package chap08;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class p03 {
	public static void main(String[] args) throws Exception {
		File file = new File("c:/windows/system.ini");
		Reader fw = new FileReader(file);
		char [] cbuf = new char[10];
		String data = "";
		
		int readData;
		while ((readData = fw.read(cbuf)) != -1) {
			data += new String(cbuf);
		}
		data = data.toUpperCase();
		System.out.println(data);
		fw.close();
	}
}
