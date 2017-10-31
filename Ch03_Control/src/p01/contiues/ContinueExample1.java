package p01.contiues;
/**
 * continue문
 */
public class ContinueExample1 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.print("\t i = " + i);
			if (i > 5) break;
			System.out.println("\t i\' = " + i);
		}
		System.out.println();
		for (int i = 0; i <= 10; i++) {
			System.out.print("\t i = " + i);
			if (i > 5) continue;
			System.out.println("\t i\' = " + i);
		}
	}
}
