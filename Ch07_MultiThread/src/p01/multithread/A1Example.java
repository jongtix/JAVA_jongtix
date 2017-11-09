package p01.multithread;

public class A1Example {
	public static void main(String[] args) {
		A1 a1 = new A1("subA"); // Thread 객체 생성 - subA
		A1 a2 = new A1("subB"); // thread 객체 생성 - subB

		// Thread의 run() 메소드 실행을 요청하는 메소드 start()
		a1.start();
		a2.start();

		for (int i = 1; i < 100; i++) {
			System.out.print("main" + i + "\t");
			if (i % 10 == 0) {
				System.out.println();
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
