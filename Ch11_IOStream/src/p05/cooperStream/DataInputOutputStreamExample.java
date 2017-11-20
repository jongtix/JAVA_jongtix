package p05.cooperStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 기본 데이터 타입(byte, short, char, int, long, double, float, boolean, String)의 입출력시 사용하는 보조 스트림
 * 		- DataInputStream, DataOutputStream
 * 		- 보조 스트림은 단독으로 사용 불가
 * */
public class DataInputOutputStreamExample {
	public static void main(String[] args) {
		FileOutputStream fos; // byte 단위의 출력 스트림
		DataOutputStream dos; // primitive 타입의 데이터 출력 보조 스트림
		FileInputStream fis; // byte 단위의 입력 스트림
		DataInputStream dis; // primitive 타입의 데이터 입력 보조 스트림
		File f = new File("c:/temp/primitive.dat");
		try {
			fos = new FileOutputStream(f); // 주스트림 객체 생성
			dos = new DataOutputStream(fos); // 보조스트림 객체 생성
			fis = new FileInputStream(f); // 주스트림 객체 생성
			dis = new DataInputStream(fis); // 보조 스트림 객체 생성
			
			// 파일에 기록하기
			dos.writeUTF("홍길동"); // String 타입의 값 저장
			dos.writeDouble(95.5); // 점수
			dos.writeInt(1); // 순번
			
			dos.writeUTF("일지매");
			dos.writeDouble(90.3);
			dos.writeInt(2);
			
			// 자원 해제
			dos.flush();
			dos.close();
			fos.close();
			
			// 파일 읽기
			// *** (중요) 기록한 순서대로 읽어들이기 *** => String -> double -> int 순 기록이면 String -> double -> int 순으로 읽어야 함.
			for (int i = 0; i < 2; i++) {
				String name = dis.readUTF();
				double score = dis.readDouble();
				int order = dis.readInt();
				
				System.out.println(order + " : " + name + " : " + score);
			}
			dis.close();
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		};
	}
}
