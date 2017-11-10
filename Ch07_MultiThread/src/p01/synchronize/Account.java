package p01.synchronize;

public class Account {
	// 필드
	long balance;
	
	void deposit(long amount) {
		balance += amount;
	}
	
	void inquiry() {
		System.out.println("잔액 : " + balance);
	}
}
