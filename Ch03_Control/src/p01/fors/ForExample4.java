package p01.fors;
/**
 * for반복문(초기값; 체크; 증감)
 */
public class ForExample4 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 4; i >=0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 4; i >= 0; i--) {
			for (int j = i; j >= 0; j --) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		System.out.println();
		for (int i = 0; i <= 4; i++) {
			for (int k = 0; k <= (4 - i); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= (4 - i); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
