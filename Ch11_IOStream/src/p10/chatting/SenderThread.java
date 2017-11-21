package p10.chatting;
/**
 * 송신 thread 객체
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
	Socket socket;

	public SenderThread(Socket socket) {
		super();
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream()); // 출력 스트림
			while (true) {
				System.out.print("발신 > ");
				String str = reader.readLine();
				if (str.equals("bye")) {
					break;
				}
				writer.println(str);
				writer.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close(); // 클라이언트 종료시 반드시 소켓 해제
			} catch (Exception e) {
				
			}
		}
	}
}
