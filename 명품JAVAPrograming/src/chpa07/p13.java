package chpa07;

import java.util.Scanner;
import java.util.Vector;

public class p13 {
	Scanner scanner = new Scanner(System.in);
	Supercom supercom;
	Vector<Supercom> vec;
	
	p13() {
		supercom = new Supercom();
		vec = new Vector<>();
	}
	
	void run() {
		System.out.println("수퍼컴이 작동합니다. 프로그램을 입력해주셍. GO를 입력함녀 작동합니다.");
		System.out.print(">> ");
		String command = scanner.next();
		String str = scanner.next();
		int x = scanner.nextInt();
		switch (command) {
		case "mov":
			mov(str, x);
			vec.add(supercom);
			break;
		case "add":
			add(str, x);
			vec.add(supercom);
			break;
		case "sub":
			sub(str, x);
			vec.add(supercom);
			break;
		case "jn0":
			jn0(str, x);
			vec.add(supercom);
			break;
		case "prt":
			prt(str, x);
			vec.add(supercom);
			break;
		case "go":
		case "GO":
			break;
		}
	}
	
	void mov(String str, int sum) {
		switch (str) {
		case "i":
			supercom.setI(sum);
			break;
		case "sum":
			supercom.setSum(sum);
			break;
		case "n":
			supercom.setN(sum);
			break;
		}
	}
	void add(String str, int sum) {
		switch (str) {
		case "i":
			supercom.setI(supercom.getI() + sum);
			break;
		case "sum":
			supercom.setSum(supercom.getSum() + sum);
			break;
		case "n":
			supercom.setN(supercom.getN() + sum);
			break;
		}
	}
	void sub(String str, int sum) {
		switch (str) {
		case "i":
			supercom.setI(supercom.getI() - sum);
			break;
		case "sum":
			supercom.setSum(supercom.getSum() - sum);
			break;
		case "n":
			supercom.setN(supercom.getN() - sum);
			break;
		}
	}
	void jn0(String str, int sum) {
		switch (str) {
		case "n":
			if (sum == 0) {
				do {
					vec.remove(vec.size() - 1);
				} while (vec.size() > sum);
			}
			break;

		default:
			break;
		}
	}
	void prt(String str, int sum) {
		System.out.println("출력할 결과는 " + vec.get(vec.size() - 1).getSum() + ". 프로그램 실행 끝");
	}
}

class Supercom {
	private int i;
	private int sum;
	private int n;
	
	public Supercom(int i, int sum, int n) {
		super();
		this.i = i;
		this.sum = sum;
		this.n = n;
	}
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}