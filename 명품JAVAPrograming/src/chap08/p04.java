package chap08;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class p04 {
	public static void main(String[] args) throws Exception {
		File file = new File("c:/windows/system.ini");
		Reader reader = new FileReader(file);
		Scanner scanner = new Scanner(reader);
		int lineNumber = 1;
		System.out.println(file.getPath() + " 파일을 읽어 출력합니다.");
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			
			System.out.printf("%4d:", lineNumber);
			System.out.println("\t" + line);
			lineNumber++;
		}
		reader.close();
	}
}
