package p01.tryCatchFinally;

/**
 * 소유주: String 타입의 필드 - owner 계좌번호: String 타입의 필드 - ano 잔액: long 타입의 필드 -
 * balance
 */
public class Account {
	// 필드
	String owner; // 소유주
	String ano; // 계좌번호
	long balance; // 잔액

	// 생성자(owner, ano, balance) {}
	public Account() {
		super();
	}

	public Account(String owner, String ano) {
		super();
		this.owner = owner;
		this.ano = ano;
	}

	public Account(String owner) {
		super();
		this.owner = owner;
	}

	public Account(String owner, String ano, long balance) {
		super();
		this.owner = owner;
		this.ano = ano;
		this.balance = balance;
	}

	// 메소드 getter/setter
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	// 메소드
	public void deposit(int amount) {
		balance += amount;
	}

	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			throw new Exception("잔액이 모자랍니다.");
		} else {
			balance -= amount;
		}
		return amount;
	}
}
