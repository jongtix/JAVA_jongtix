package chap08;

import java.io.File;
import java.io.FileInputStream;

public class p07 {
	public static void main(String[] args) throws Exception {
		String dir = "C:\\Users\\JTG\\Desktop\\";
		File file1 = new File(dir + "KakaoTalk_20170509_183133786.jpg");
		FileInputStream fis = new FileInputStream(file1);
		byte [] fisbuf = new byte [1024];
		int count = 0, check;
		while ((check = fis.read(fisbuf, 0, fisbuf.length)) != -1) {
			fisbuf[count] = (byte) check;
			count++;
		}
		fis.close();
		
		File file2 = new File(dir + "KakaoTalk_20170509_183133786_복사본.jpg");
		if (!file2.exists()) {
			file2.createNewFile();
		}
		FileInputStream fis2 = new FileInputStream(file2);
		byte [] fis2buf = new byte [1024];
		check = 0;
		count = 0;
		while ((check = fis2.read()) != -1) {
			fis2buf[count] = (byte) check;
			count++;
		}
		fis2.close();
		
		System.out.println("복사 완료");
	}
}
