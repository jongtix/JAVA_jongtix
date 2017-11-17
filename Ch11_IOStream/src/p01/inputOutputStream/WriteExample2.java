package p01.inputOutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("c:/temp/test.txt");
			String str = "DEF";
			byte [] data = str.getBytes();
			os.write(data); // byte 타입의 배열 전체를 write하는 메소드
			os.flush();
			os.close();
			
			os = new FileOutputStream("c:/temp/test.txt");
			os.write(data, 1, 2); // 배열의 일부만 기록하는 메소드
			os.flush();
			os.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
