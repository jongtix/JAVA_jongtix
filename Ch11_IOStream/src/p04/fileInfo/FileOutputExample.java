package p04.fileInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:\\Users\\Public\\Pictures\\Sample Pictures/Chrysanthemum.jpg";
		String targetFileName = "c:/temp/Target/forest.jpg";
		
		File dir = new File("c:/temp/Target");
		if (dir.exists() == false) {
			dir.mkdirs();
		}
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte [] readBytes = new byte[100];
		while ((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사 완료!");
	}
}
