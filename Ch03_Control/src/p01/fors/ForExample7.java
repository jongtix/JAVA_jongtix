package p01.fors;
/**
 * for(초기식; 점검식; 증감식) {
 * 
 * 		실행문;
 * 
 * }
 */
public class ForExample7 {
	public static void main(String[] args) {
		//구구단 출력
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + " x " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		//구구단 출력 - 세로
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}
