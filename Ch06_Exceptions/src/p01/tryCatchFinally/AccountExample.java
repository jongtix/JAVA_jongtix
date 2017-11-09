package p01.tryCatchFinally;

public class AccountExample /* throws Exception */ {
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setOwner("이순신");
		account1.setAno("111-000");
		account1.setBalance(100000);
		String name = account1.getOwner();
		String ano = account1.getAno();
		long balance = account1.getBalance();
		System.out.println("정보 : 소유자 - " + name + ", 계좌번호 - " + ano + ", 잔액 - " + balance);
		
		Account account2 = new Account("홍길동");
		account2.ano = "111-001";
		account2.balance = 1000000;
		name = account2.getOwner();
		ano = account2.getAno();
		balance = account2.getBalance();
		System.out.println("정보 : 소유자 - " + name + ", 계좌번호 - " + ano + ", 잔액 - " + balance);
		
		Account account3 = new Account("일지매", "111-002");
		account3.balance = 100000;
		name = account3.getOwner();
		ano = account3.getAno();
		balance = account3.getBalance();
		System.out.println("정보 : 소유자 - " + name + ", 계좌번호 - " + ano + ", 잔액 - " + balance);
		
		Account account4 = new Account("임꺽정", "111-003", 100000);
		name = account4.getOwner();
		ano = account4.getAno();
		balance = account4.getBalance();
		System.out.println("정보 : 소유자 - " + name + ", 계좌번호 - " + ano + ", 잔액 - " + balance);
		
		// 입금처리
		account4.deposit(50000);
		System.out.println(account4.getBalance());
		
		// 출금처리
		// 호출되는 메소드가 throws Exception {}으로 선언되어 있으면 호출하는 곳에서 예외처리를 해줘야함.
		// try - catch() {} - 호출한 쪽에서 예외를 처리하는 명령
		// throws Exception {} - 이 프로그램을 호출한 곳으로 예외를 위임하는 명령
		try {
			account4.withdraw(80000);
			System.out.println(1);
			account4.withdraw(80000);
			System.out.println(2);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // getMessage()가 호출된 메소드의 Exception()의 생성자 매개변수의 메시지를 받아서 출력
		}
	}
}
