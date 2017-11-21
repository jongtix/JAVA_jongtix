package p10.chatting;

import java.net.Socket;
/**
 * MultiThread 방식의 Client
 * 		- SenderThread와 RecieveThread 중 하나라도 실행 중이면 main 메소드는 종료되지 않는다.
 * 		- 서버와 클라이언트간의 통신은 소켓간의 통신.
 * */
public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("localhost", 5001); // Socket(ip주소, port);
			Thread th1 = new SenderThread(socket);
			Thread th2 = new ReceiverThread(socket);
			th1.start();
			th2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
