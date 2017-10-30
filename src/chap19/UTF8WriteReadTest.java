package chap19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class UTF8WriteReadTest {
	public static void main(String[] args) throws IOException {
		//파일 저장하기
		OutputStream os = new FileOutputStream("C:\\Users\\Administrator\\Documents\\JAVAjongtix\\Test문서.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bwr = new BufferedWriter(writer);
		Scanner s = new Scanner(System.in);
		bwr.write(s.next());
		bwr.close();
		//파일 읽어서 출력하기
		char[] charsBuffer = new char[100];
		InputStream is = new FileInputStream("C:\\Users\\Administrator\\Documents\\JAVAjongtix\\Test문서.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		BufferedReader brd = new BufferedReader(reader);
		while(true) {
			String readLine1 = brd.readLine();
			if(readLine1 == null) {
				break;
			}
			System.out.println(readLine1);
		}
//		int readCnt = reader.read(charsBuffer);
//		for(int i = 0; i < readCnt; i++) {
//			System.out.print(charsBuffer[i]);
//		}
//		System.out.println();
//		System.out.println(readCnt);
		brd.close();
	}
}
