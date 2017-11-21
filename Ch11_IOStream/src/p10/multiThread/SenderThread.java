package p10.multiThread;
/**
 * 송신 thread 객체
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread {
	Socket socket;
	String name; // 클라이언트 구분 이름 필드

	public SenderThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream()); // 출력 스트림
			writer.println(name + " > ");
			writer.flush();
			while (true) {
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
