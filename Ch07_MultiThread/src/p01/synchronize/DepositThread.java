package p01.synchronize;

public class DepositThread implements Runnable {
	// 필드
	Account myAccount;
	
	// 생성자
	public DepositThread(Account myAccount) {
		super();
		this.myAccount = myAccount;
	}
	
	// 메소드
	@Override
	public void run() { // 통장에 1원식 입금, 1000 번 반복 후 1000원 예상
		for (int i = 0; i < 1000; i++) {
			myAccount.deposit(1);
		}
		myAccount.inquiry(); // 현재 잔액 출력
	}

}
