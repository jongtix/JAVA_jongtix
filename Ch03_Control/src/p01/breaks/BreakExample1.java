package p01.breaks;
/**
 * break문
 */
public class BreakExample1 {
	public static void main(String[] args) {
		float f = 1252;
		System.out.println(f);
		double d = 25.5;
		System.out.println(d);
		int num = 0, sum = 0;
		while (true) {
			num++;
			sum += num;
			if (num == 100) {
				break; //while()문을 빠져나가기 위한 명령문
			}
		}
		System.out.println("sum = " + sum);
		System.out.println("종료");
	}
}
