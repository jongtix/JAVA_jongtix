package chap08;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class p01 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		File dir = new File("C:\\Users\\Administrator\\Documents\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp");
		File f = new File("C:\\Users\\Administrator\\Documents\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp\\phone.txt");
		if (!dir.exists()) {
			dir.mkdir();
		}
		if (!f.exists()) {
			f.createNewFile();
		}
		
		Writer fw = new FileWriter(f);
		System.out.println("전화번호 입력 프로그램입니다.");
		do {
			System.out.print("이름 전화번호 >> ");
			String line = scanner.nextLine();
			if (line.equals("그만")) {
				System.out.println(f.getPath() + "에 저장하였습니다.");
				break;
			}
			fw.write(line + System.lineSeparator());
		} while (true);
		fw.flush();
		fw.close();
	}
}
