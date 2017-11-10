package p01.priority;
/**
 * 쓰레드의 우선순위 1 ~ 10까지, 숫자가 높은 쓰레드가 우선 순위 높음
 * MIN_PRIORITY(1) <= 쓰레드 우선순위 <=MAX_PRIORITY(10)
 * 우선순위 강제 조정 setPriority(숫자) : 원하는 우선순위로 조정
 * */
public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); // 가장 낮은 우선순위
			} else {
				thread.setPriority(thread.MAX_PRIORITY); // 가장 높은 우선순위
			}
			thread.start(); // 실행
		}
	}
}
