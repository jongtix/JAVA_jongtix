package p01.dowhile;

/**
 * 이중 do-while()문
 */
public class DoExample2 {
	public static void main(String[] args) {
		int i = 1, j = 2;
		do {
			do {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
				j++;
			} while (j <= 9);
			j = 2;
			System.out.println();
			i++;
		} while (i <= 9);
	}
}
