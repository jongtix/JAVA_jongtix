package p09.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 작업 객체인 경우 queue에 저장하여 순서대로 실행하는 경우 사용
 * */
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		messageQueue.offer(new Message("SendMail", "홍길동"));
		messageQueue.offer(new Message("SendSMS", "일지매"));
		messageQueue.offer(new Message("SendKakaotalk", "임꺽정"));
		
		while (messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "SendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "SendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
			case "SendKakaotalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
		}
	}
}
