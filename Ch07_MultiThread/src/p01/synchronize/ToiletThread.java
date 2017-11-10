package p01.synchronize;

public class ToiletThread implements Runnable {
	// 필드
	TwoToilets twoToilets;
	String user;
	
	// 생성자
	public ToiletThread(TwoToilets twoToilets, String user) {
		super();
		this.twoToilets = twoToilets;
		this.user = user;
	}
	
	@Override
	public void run() {
		try {
			twoToilets.use(user); // 사용 처리 - wait(); -> 다른 쓰레드가 기다림
			Thread.sleep(5000); // 5초간 정지
			twoToilets.done(user); // 사용 완료 - notifyAll(); -> 다른 쓰레드에 종료 알림
		} catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
