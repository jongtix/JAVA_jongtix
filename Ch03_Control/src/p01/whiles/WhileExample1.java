package p01.whiles;

/**
 * While문(조건식) { 실행문; } - while문은 시작과 종료 시점을 알지 못할 때 주로 사용.
 */
public class WhileExample1 {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		while (i <= 10) {
			sum += i;
			System.out.println(i + "일 때 합계는 : " + sum);
			i++; // 증감식은 {}실행부 내에서 기술.
					// while문에서 증감이 없으면 무한반복에 빠질 수 있음.
		}
		System.out.println();
		System.out.println("최종 합계 : " + sum);
	}
}
