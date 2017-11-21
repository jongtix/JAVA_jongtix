package p10.multiThread;

import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.10.65", 5001);
			Thread th1 = new SenderThread(socket, "정택근");
			Thread th2 = new ReceiverThread(socket);
			th1.start();
			th2.start();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
