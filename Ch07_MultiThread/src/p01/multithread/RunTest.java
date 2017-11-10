package p01.multithread;

public class RunTest {
	public static void main(String[] args) {
		// Runnable로 구현된 객체 생성
		// Thread() 생성자의 매개변수로 (Thread 클래스, Thread 이름)을 넘기면 생성되는 Thread는 사용자 정의 이름을 부여받음.
		Thread th1 = new Thread(new B2(), "Thread1");
		Thread th2 = new Thread(new B2(), "Thread2");
		
		th1.start();
		th2.start();
	}
}

/**
 * 자바는 클래스의 다중상속을 허락하지 않음.
 * B2 클래스는 멀티쓰레드를 생성해야하는 상황에 B1도 상속 받아야하는 상황
 * class B2 extends B1, Thread {} // 불가능
 * 보조적 수단으로 인터페이스 사용
 * class B2 extends B1 implements Runnable {}
 * */
class B1 {}
class B2 extends B1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// currentThread() : 현재 실행 중인 쓰레도의 정보를 얻어오는 메소드 
			// getName() : 실행 중인 쓰레드의 이름 리턴
			System.out.print(Thread.currentThread().getName() + "가 실행 중\t");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
	
}