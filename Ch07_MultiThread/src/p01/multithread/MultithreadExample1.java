package p01.multithread;

public class MultithreadExample1 {
	public static void main(String[] args) {
		// 객체 생성
		G1 g1 = new G1();
		
		// Thread 실행 메소드 start(); -> run() 메소드 실행
		g1.start();
		
		// 객체 생성
		G2 g2 = new G2();
		
		// Thread 객체 생성
		// Runnable로 구현된 Thread 객체는 Thread 생성자의 매개변수로 넘어가서 Thread 객체가 됨.
		Thread th1 = new Thread(g2, "g2");
		
		// start()로 JVM에 run() 메소드의 실행을 요청
		th1.start();
	}
}

// Thread클래스를 상속받은 Thread 객체
class G1 extends Thread {
	public void run() {
		for (int i = 0; i < 2000; i++) {
			System.out.print("+");
		}
		System.out.println();
	}
}

// Runnable을 구현한 Thread 객체
class G2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
}