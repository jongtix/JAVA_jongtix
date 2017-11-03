package test;

import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		//Bank - 0001, 홍길동, 100000
		for (int i = 0; i < accountArray.length; i++) {
			String ano = scanner.next();
			String onwer = scanner.next();
			int balance = scanner.nextInt();
			accountArray[i] = new Account(ano, onwer, balance);
			
			// 
		}
	}
	
	private static void accountList() {
		// 
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + accountArray[i].getOwner() + accountArray[i].getBalance());
			}
		}
	}
	
	private static void deposit() {
		// 계좌번호 선택
		// 입금
		
	}
	
	private static void withdraw() {
		// 계좌번호 선택
		// 출금(잔액 < 출금액이면 불가)
	}
}