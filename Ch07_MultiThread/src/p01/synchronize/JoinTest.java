package p01.synchronize;

import java.util.ArrayList;

public class JoinTest {
	// 
	public static ArrayList<String> carList = new ArrayList<>();
	public static void main(String[] args) {
		Before bf = new Before("bf");
		After at = new After("at");
		After atr = new After("atr");
		Thread th = new Thread(atr);
		try {
			bf.start();
			bf.join(); // join 메소드를 호출한 쓰레드는 일시정지되어 호출한 작업이 완료될 때까지 기다림.
					   // 정지 -> 실행 상태로 돌아가기 위해서는 작업이 완료되거나 정해진 시간이 지나야 함. 
			at.start();
			atr.start();
		} catch (Exception e) {
			
		}
				
	}
}
