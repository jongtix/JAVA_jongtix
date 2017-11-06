package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BankApp {
	private static Account[] accountArray = new Account[0];
	private static Scanner scanner = new Scanner(System.in);
	private static int cnt = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("선택>");
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
		cnt++;
		Account[] tempAccPre = new Account[accountArray.length];
		System.arraycopy(accountArray, 0, tempAccPre, 0, accountArray.length);
		accountArray = new Account[cnt];
		String[] tempAno = new String[tempAccPre.length];
		for (int i = 0; i < tempAno.length; i++) {
			tempAno[i] = tempAccPre[i].getAno();
		}
		
		// Bank - 0001, 홍길동, 100000
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		while (Arrays.asList(tempAno).contains(ano)) {
			System.out.println("계좌번호가 중복됩니다.\n계좌번호를 다시 설정해주세요.");
			System.out.println("계좌번호 : ");
			ano = scanner.next();
		}
		System.out.println("소유자 : ");
		String onwer = scanner.next();
		System.out.println("잔액 : ");
		int balance = scanner.nextInt();			
		
		System.arraycopy(tempAccPre, 0, accountArray, 0, tempAccPre.length);
		accountArray[cnt - 1] = new Account(ano, onwer, balance);
	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println("계좌번호 : " + accountArray[i].getAno()
								 + ", 소유자 : " + accountArray[i].getOwner()
								 + ", 잔액 : " + accountArray[i].getBalance());
			}
		}
	}

	private static void deposit() {
		// 계좌번호 선택
		// 입금
		System.out.println("계좌번호 선택>>");
		String accountNo = scanner.next();
		String[] tempAno = new String[accountArray.length];
		for (int i = 0; i < tempAno.length; i++) {
			tempAno[i] = accountArray[i].getAno();
		}
		if (Arrays.asList(tempAno).contains(accountNo)) {
			int i = Arrays.asList(tempAno).indexOf(accountNo);
			System.out.println("입금할 금액>>");
			int money = scanner.nextInt();
			accountArray[i].setBalance(accountArray[i].getBalance() + money);
		} else {
			System.out.println("계좌번호를 확인해주세요.");
		}
	}

	private static void withdraw() {
		// 계좌번호 선택
		// 출금(잔액 < 출금액이면 불가)
		System.out.println("계좌번호 선택>>");
		String accountNo = scanner.next();
		String[] tempAno = new String[accountArray.length];
		for (int i = 0; i < tempAno.length; i++) {
			tempAno[i] = accountArray[i].getAno();
		}
		if (Arrays.asList(tempAno).contains(accountNo)) {
			int i = Arrays.asList(tempAno).indexOf(accountNo);
			System.out.println("출금할 금액>>");
			int money = scanner.nextInt();
			if (accountArray[i].getBalance() - money > 0) {
				accountArray[i].setBalance(accountArray[i].getBalance() - money);				
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else {
			System.out.println("계좌번호를 확인해주세요.");
		}
	}
}