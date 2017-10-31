package p01.fors;
/**
 * for문
 */
public class ForExample5 {
	public static void main(String[] args) {
		//1 ~ 20까지의 정수 중 2의 배수도 아니고 3의 배수도 아닌 수들의 합?
		int sum = 0;
		for( int i = 1; i <= 20; i++) {
			if(i%2 != 0 && i%3 != 0) { //2의 배수도 아니고(and) 3의 배수도 아니다.
				sum += i;
			}
		}
		System.out.println("전체 합 : " + sum);
	}
}
