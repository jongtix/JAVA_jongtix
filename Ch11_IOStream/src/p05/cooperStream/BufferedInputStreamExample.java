package p05.cooperStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * Buffered 보조 스트림 - 속도향상 목적
 * */
public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		File f = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg");
		FileInputStream fis1 = new FileInputStream(f);
		start = System.currentTimeMillis(); // 시작시간
		while (fis1.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("BufferedStream 미사용시 : " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("BufferedStream 사용시 : " + (end - start) + "ms");
		fis2.close();
	}
}
