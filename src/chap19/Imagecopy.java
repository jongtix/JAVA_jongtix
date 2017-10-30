package chap19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Imagecopy {
	public static void main(String[] args) throws IOException{
		
		//image 파일 읽기
		byte[] imageData = new byte[1000000]; //파일크기가 859KB이므로 배열크기를 크게 잡음
		InputStream is = new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		int numOfBytes = is.read(imageData);
		
		// byte배열의 내용을 image 파일로 저장하기
		OutputStream os = new FileOutputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum2.jpg");
		for(int i = 0; i < numOfBytes; i++) {
			os.write(imageData[i]); //읽은 byte 갯수만큼 byte내용을 저장
		}
		os.close();
	}
}
