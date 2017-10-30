package p01.fors;
/**
 * 반복문(for)
 */
public class ForExample3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 10; i >= 0; i--) {
			System.out.print((10 - i) + "\t");
		}
		System.out.println();
		for (int i = 0; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i <= 10; i *= 2) {
			System.out.print(i + "\t");
		}
	}
}
