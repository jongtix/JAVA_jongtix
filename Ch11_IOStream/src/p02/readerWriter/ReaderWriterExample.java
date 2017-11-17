package p02.readerWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class ReaderWriterExample {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		File f = new File("c:/temp/test1.txt");
		Writer writer = new FileWriter(f);
		Reader reader = new FileReader(f);
		String data = scanner.nextLine();
		writer.write(data);
		writer.flush();
		writer.close();
		
		int readData;
		while (true) {
			readData = reader.read();
			if (readData == -1) break;
			System.out.print((char) readData);
		}
		reader.close();
	}
}
