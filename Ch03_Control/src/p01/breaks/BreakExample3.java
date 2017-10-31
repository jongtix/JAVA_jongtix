package p01.breaks;

/**
 * 이중 반복문을 빠져나가는 break문 Label:을 선운 후 break Label;
 */
public class BreakExample3 {
	public static void main(String[] args) {
		int i = 0, j = 0;
		KK: while (true) {
			i++;
			while (true) {
				System.out.print("j = " + j + "\t");
				if (j == 5)
					break KK; //라벨 KK로 선언된 반복문을 벗어남
				j++;
			}
//			System.out.println("i = " + i);
//			if (i == 10)
//				break;
		}
		System.out.println("종료");
	}
}
