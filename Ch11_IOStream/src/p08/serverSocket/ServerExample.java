package p08.serverSocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 서버 - 자료를 제공하는 객체
 * 		- 서버는 ServerSocket을 가진다.
 * */
public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 서버 소켓 객체 선언
		try {
			serverSocket = new ServerSocket(); // 서버 소켓 객체 생성
			
			// 서버 소켓의 주소 및 port 번호 세팅
			serverSocket.bind(new InetSocketAddress("localhos", 5001));
			
			while (true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); // 요청이 들어오면 accept() 메소드로 소켓 생성
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); // 요청이 들어온 client의 주소 정보를 얻어옴.
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch (Exception e) {
			
		}
		
		// 서버 소켓 종료시 클라이언트와 연결이 있으면 연결을 끊은 후 종료.
		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				
			}
		}
	}
}
