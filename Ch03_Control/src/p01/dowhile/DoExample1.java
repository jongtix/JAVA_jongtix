package p01.dowhile;
/**
 * do-while(조건식);
 * - while문과 비슷.
 * - 먼저 1회 실행 후 조건검사를 함.
 */
public class DoExample1 {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		do {
			sum += i;
			System.out.println(sum);
			i++;
		} while (i <= 10); //i가 10보다 작거나 같을 경우 반복
		System.out.println("최종결과 : " + sum);
	}
}
