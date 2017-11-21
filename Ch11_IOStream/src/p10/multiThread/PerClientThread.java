package p10.multiThread;
/**
 * 클라이언트 관리 객체
 * */

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class PerClientThread extends Thread {
	// 클라이언트 저장 객체 생성
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	Socket socket;
	PrintWriter writer;
	
	public PerClientThread(Socket socket) {
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream()); // 클라이언트로부터 받은 name의 값으로 writer 객체를 생성하여 list에 저장
			list.add(writer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void sendAll(String message) {
		for (PrintWriter writer : list) {
			writer.println(message); // 메시지 출력
			writer.flush(); // 버퍼에 남아있는 메시지 밀어내기
		}
	}
	
	@Override
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓으로 들어오는 byte단위의 데이터를 문자단위로 변환하여 버퍼에 저장하는 객체 생성
			name = reader.readLine();
			sendAll("#" + name + "님이 입장하셨습니다."); // 메시지를 모두에게 전달하는 메소드
			while (true) {
				String message = reader.readLine();
				if (message == null) {
					break;
				}
				sendAll(name + " > " + message);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			list.remove(writer); // 해당 객체를 list에서 제거
			sendAll("#" + name + "님이 나가셨습니다.");
			try {
				socket.close();
			} catch (Exception e) {
				
			}
		}
	}
}
