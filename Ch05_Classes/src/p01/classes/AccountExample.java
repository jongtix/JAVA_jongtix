package p01.classes;

public class AccountExample {
	public static void main(String[] args) {
		//객체생성
		Account account = new Account(); //계좌(Account)instance 생성 및 대입
		account.setOwner("홍길동"); //setOwner("값") -> owner필드에 값이 저장
		account.setBalance(10000); //setBalance(값) -> balance필드에 값이 저장
		
		System.out.println(account.getOwner() + " " + account.getBalance());
		//추가 입금
		account.deposit(5000); //클래스에 설계된 deposit(){}메소드를 통해서 balance필드에 값이 저장
		System.out.println(account.getOwner() + " " + account.getBalance());
		
		//출금
		account.withdraw(12000);
		System.out.println("잔고 : " + account.getBalance());
		account.withdraw(7000);
		System.out.println("잔고 : " + account.getBalance());
	}
}
