package p01.contiues;
/**
 * continue문
 */
public class ContinueExample2 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j <= 10; j++) {
				System.out.print("j = " + j + "\t");
				if (j > 2) continue;
				System.out.println("j출력");
			}
			System.out.println();
			System.out.println();
		}
	}
}
