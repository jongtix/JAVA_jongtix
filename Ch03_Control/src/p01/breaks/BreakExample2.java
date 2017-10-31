package p01.breaks;

/**
 * break문
 */
public class BreakExample2 {
	public static void main(String[] args) {
		int i = 0, j = 0;
		while (true) {
			i++;
			System.out.println("i = " + i);
			while (true) {
				System.out.print(j + "\t");
				if (j == 5)
					break;
				j++;
			}
			j = 0;
			if (i == 10)
				break;
			System.out.println();
			System.out.println();
		}
		System.out.println("종료");
	}
}
