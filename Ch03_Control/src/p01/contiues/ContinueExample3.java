package p01.contiues;
/**
 * continue문
 */
public class ContinueExample3 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int num1 = (int) (Math.random()*6 + 1);
			int num2 = (int) (Math.random()*6 + 1);
			System.out.print("num1 = " + num1 + "\t");
			System.out.print("num2 = " + num2 + "\t");
			if ((num1 + num2) == 6) {
				System.out.println();
				continue;
			}
			System.out.println("sum = " + (num1 + num2));
		}
	}
}
