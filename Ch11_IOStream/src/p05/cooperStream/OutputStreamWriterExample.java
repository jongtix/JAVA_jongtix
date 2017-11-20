package p05.cooperStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * char 타입의 데이터를 byte 타입의 데이터로 저장
 * 		OutputStreamWriter
 * */
public class OutputStreamWriterExample {
	public static void main(String[] args) {
		File f = new File("c:/temp/file9.txt");
		FileOutputStream fos; // byte 단위의 출력 스트림
		Writer writer; // char 단위의 출력 스트림
		try {
			fos = new FileOutputStream(f);
			writer = new OutputStreamWriter(fos); // char 단위의 데이터 스트림을 byte 단위의 스트림으로 변환하는 보조 스트림
			
			String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
			writer.write(data); // 문자열(즉, char 배열을 write() 메소드의 값으로 전달)
			
			writer.flush();
			writer.close();
			System.out.println("파일 저장이 끝났습니다.");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
