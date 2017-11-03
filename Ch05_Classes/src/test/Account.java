package test;

public class Account {
	// 필드
	private String ano; // 계좌번호
	private String owner; // 소유자
	private int balance; // 잔고
	
	// 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 메소드
	protected String getAno() {
		return ano;
	}
	protected void setAno(String ano) {
		this.ano = ano;
	}
	protected String getOwner() {
		return owner;
	}
	protected void setOwner(String owner) {
		this.owner = owner;
	}
	protected int getBalance() {
		return balance;
	}
	protected void setBalance(int balance) {
		this.balance = balance;
	}
}
