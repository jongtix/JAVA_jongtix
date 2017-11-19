package chap08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class p06 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 파일 이름을 입력하세요 >> ");
		String file1 = scanner.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요 >> ");
		String file2 = scanner.nextLine();
		
		String dir = "H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp\\";
		FileInputStream fis1 = new FileInputStream(dir + file1 + ".txt");
		FileInputStream fis2 = new FileInputStream(dir + file2 + ".txt");
		String newFileName = "newFile.txt";
		File newFile = new File(dir + newFileName);
		if (!newFile.exists()) {
			newFile.createNewFile();
		}
		
		byte [] buf1 = new byte[1024];
		byte [] buf2 = new byte[1024];
		
		int buf1Count = 0;
		int buf2Count = 0;
		String data = "";
		while ((buf1Count = fis1.read(buf1, 0, buf1.length)) != -1) {
			data += new String(buf1, 0, buf1Count);
		}
		while ((buf2Count = fis2.read(buf2, 0, buf2.length)) != -1) {
			data += new String(buf2, 0, buf2Count);
		}
		fis1.close();
		fis2.close();
		
		Writer writer = new FileWriter(newFile);
		char [] bufNew = new char[1024];
		bufNew = data.toCharArray();
		for (int i = 0; i < bufNew.length; i++) {
			writer.write(bufNew[i]);
		}
		System.out.println(newFile.getPath() + " 파일을 저장하였습니다.");
		writer.flush();
		writer.close();
	}
}
