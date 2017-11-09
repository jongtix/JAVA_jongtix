package p01.multithread;
/**
 * Multithread 객체 Thread
 * */
public class A1 extends Thread {
	A1 (String str) {
		super(str);
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(getName() + i + "\t"); // getName()은 현재 실행중인 thread의 이름 리턴 메소드
			if (i % 10 == 0) {
				System.out.println();
			}
			try {
				Thread.sleep(100); // 0.1 초간 일시 정지
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
