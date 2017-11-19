package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class p05 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 temp 폴더에 있어야 합니다.");
		System.out.print("첫번재 파일 이름을 입력하세요 >> ");
		String file1 = scanner.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요 >> ");
		String file2 = scanner.nextLine();
		System.out.println(file1 + "와 " + file2 +"를 비교합니다.");
		
		String dir = "H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp\\";
		FileInputStream fis1 = new FileInputStream(dir + file1 + ".txt");
		FileInputStream fis2 = new FileInputStream(dir + file2 + ".txt");
		if (compareFile(fis1, fis2)) {
			System.out.println("같은 파일입니다.");
		} else {
			System.out.println("다른 파일입니다.");
		}
		fis1.close();
		fis2.close();
	}
	
	static boolean compareFile(FileInputStream fis1, FileInputStream fis2) throws Exception {
		byte [] buf1 = new byte[1024];
		byte [] buf2 = new byte[1024];
		
		int buf1Count = 0;
		int buf2Count;
		while ((buf1Count = fis1.read(buf1, 0, buf1.length)) != -1) {
			buf2Count = fis2.read(buf2, 0, buf2.length);
			if (buf1Count != buf2Count) {
				return false;
			}
			for (int i = 0; i < buf1Count; i++) {
				if (buf1[i] != buf2[i]) {
					return false;
				}
			}
		}
		return true;
	}
}
