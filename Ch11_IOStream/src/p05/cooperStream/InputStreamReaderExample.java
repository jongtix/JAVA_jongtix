package p05.cooperStream;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * byte단위의 입력데이터를 char단위의 데이터로 변환하는 보조스트림
 * 		- InputStreamReader
 * 			ex) abcdef 키보드로 입력 -> ASCII코드 값인 byte값들이 스트림으로 이동
 * 				read(cbuf) <- cbuf [] : [a][b][c][b][e][f]
 * 							  readCharNo = 6
 * 				new String(cbuf, 0, 6);
 * */
public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in; // 콘솔(키보드)로부터 byte단위의 입력
		Reader reader = new InputStreamReader(is); // 보조스트림
//						new Reader(); Reader 객체는 char 단위 스트림
		int readCharNo;
		char [] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		reader.close(); // 스트림 자원 해제
	}
}
