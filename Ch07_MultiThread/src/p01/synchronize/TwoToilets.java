package p01.synchronize;

public class TwoToilets {
	// 필드
	private String User1;
	private String User2;
	private boolean is_1_Empty; // flag
	private boolean is_2_Empty; // flag
	
	// 생성자
	public TwoToilets() {
		is_1_Empty = true; // 빈 상태
		is_2_Empty = true; // 빈 상태
	}
	
	// 메소드
	public synchronized void use(String userName) throws InterruptedException {
		while ((is_1_Empty == false) && (is_2_Empty == false)) {
			wait(); // 다른 쓰레드들에게 wait 신호를 보냄
			if (is_1_Empty == true) {
				User1 = userName;
				is_1_Empty = false;
				System.out.println("화장실 1 : " + User1 + "이 사용 중");
			}  else if (is_2_Empty == true) {
				User2 = userName;
				is_2_Empty = false;
				System.out.println("화장실 2 : " + User2 + "이 사용 중");
			}
		}
	}
	
	public synchronized void done(String UserName) {
		if (UserName.equals(User1)) {
			User1 = null;
			is_1_Empty = true;
			System.out.println("화장실 1 : " + User1 + "이 사용을 완료, 현재 비어있음.");
		} else if (UserName.equals(User2)) {
			User2 = null;
			is_2_Empty = true;
			System.out.println("화장실 2 : " + User2 + "이 사용을 완료, 현재 비어있음.");
		}
		notifyAll(); // 기다리는 스레드들에게 작업이 완료되었음을 알리는 메소드
	}
	
}
