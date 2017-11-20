package p08.serverSocket;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		socket = new Socket();
		System.out.println("[연결 요청]");
		try {
			// 서버 주소와 port 번호로 연결 요청
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
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
