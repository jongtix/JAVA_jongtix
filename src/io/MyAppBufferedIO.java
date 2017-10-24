package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyAppBufferedIO {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("jeju.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("jeju5.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] buffer = new byte[10];
//		int num = 0;
		while ((bis.read(buffer)) != -1) {
//			bos.write(buffer, 0, num);
			bos.write(buffer);
		}
		
		
		bis.close();
		fis.close();
		bos.close();
		fos.close();
	}
}
