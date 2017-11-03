package test;

import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[1];
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
				System.out.println();
				break;
			case 2:
				accountList();
				System.out.println();
				break;
			case 3:
				deposit();
				System.out.println();
				break;
			case 4:
				withdraw();
				System.out.println();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		// Bank - 0001, 홍길동, 100000
		for (int i = 0; i < accountArray.length; i++) {
			System.out.print("계좌번호 : ");
			String ano = scanner.next();
			System.out.print("소유자 : ");
			String onwer = scanner.next();
			System.out.print("잔액 : ");
			int balance = scanner.nextInt();

			accountArray[i] = new Account(ano, onwer, balance);
		}
	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println("계좌번호 : " + accountArray[i].getAno()
								 + ", 소유자 : " + accountArray[i].getOwner()
								 + ", 잔액 : " + accountArray[i].getBalance() + "\n");
			}
		}
	}

	private static void deposit() {
		// 계좌번호 선택
		// 입금
		System.out.print("계좌번호 선택>>");
		String accountNo = scanner.next();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(accountNo)) {
				System.out.print("입금할 금액>>");
				int money = scanner.nextInt();
				accountArray[i].setBalance(accountArray[i].getBalance() + money);
			} else {
				System.out.println("계좌번호를 다시 확인해 주세요.");
			}
		}

	}

	private static void withdraw() {
		// 계좌번호 선택
		// 출금(잔액 < 출금액이면 불가)
		System.out.print("계좌번호 선택>>");
		String accountNo = scanner.next();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(accountNo)) {
				System.out.print("출금할 금액>>");
				int money = scanner.nextInt();
				if (accountArray[i].getBalance() - money > 0) {
					accountArray[i].setBalance(accountArray[i].getBalance() - money);					
				} else {
					System.out.println("잔액이 부족합니다.");
					break;
				}
			} else {
				System.out.println("계좌번호를 다시 확인해 주세요.");
			}
		}
	}
}