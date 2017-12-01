package chap13;

import java.util.Scanner;

public class p01 {
	public static void main(String[] args) {
		System.out.print("아무 키나 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			Thread th = new Thread(new MyThread());
			th.start();
		}
	}
	
}

class MyThread implements Runnable {
	int n;
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");
		while (true) {
			System.out.print(++n + " ");
			if (n == 10) {
				System.out.println();
				break;
			}
		}
		System.out.println("스레드 종료");
	}
}