package test;

import java.io.InputStream;
/**
 * 클라이언트에서 숫자1, 숫자2, op(+, -, x, /) 세 개의 값을 받아서 서버로 보냄
 * 서버에서 연산 결과를 클라이언트로 보냄
 * */
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(); // 클라이언트는 하나의 소켓만 생성
			System.out.println("[연결 요청]");
			// 서버 주소와 port 번호로 연결 요청
			socket.connect(new InetSocketAddress("localhost", 5004));
			System.out.println("[연결 성공]");
			
			byte [] bytes = null;
			String message = null;
			OutputStream os = socket.getOutputStream(); // 출력 객체 생성
			Scanner scanner = new Scanner(System.in);
			message = scanner.nextLine();
			bytes = message.getBytes(); // String.getBytes() -> 문자열을 byte 배열로 변환
			os.write(bytes); // 전송
			os.flush(); // message 밀어내기
			System.out.println("[데이터 보내기 성공]");
			
			InputStream is = socket.getInputStream(); // socket으로 들어오는 스트림 얻기
			bytes = new byte[1024]; // byte 단위의 값을 읽어들여 저장하는 배열
			int readByteCnt = is.read(bytes); // 읽어들인만큼 배열에 저장 후 저장된 갯수를 readByteCnt에 대입
			message = new String(bytes, 0, readByteCnt);
			System.out.println("[데이터 받기 성공] : " + message);
			
		} catch (Exception e) {
			
		}
		
		// 종료시 연결이 끊어지지 않으면 강제로 연결 해제
		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (Exception e) {

			}
		}
	}
}
