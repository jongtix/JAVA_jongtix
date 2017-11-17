package p01.inputOutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * OutputStream - byte 단위 출력 스트림
 * 				- write()
 * */
public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("c:/temp/test.txt");
			byte [] data = "ABC".getBytes(); // [A][B][C]
			for (int i = 0; i < data.length; i++) {
				os.write(data[i]);
			}
			os.flush(); // 스트림 내의 자료를 밀어내는 메소드
			os.close(); // 스트림 해제 메소드
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
