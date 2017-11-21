package p10.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread {
	Socket socket;

	public ReceiverThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				String str = reader.readLine();
				if (str == null) {
					break;
				}
				System.out.println("수신 > " + str); // 수신 메시지 출력
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
