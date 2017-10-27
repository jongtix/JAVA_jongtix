package p01.operations;
/**
 * 비트연산 -shift( <<, >>, >>>)
 */
public class BitOperExample3 {
	public static void main(String[] args) {
		int num = 0xFF00FF01;
		System.out.println(Integer.toBinaryString(num));
		int result1 = num<<3; //왼쪽으로 3bit 이동, 오른쪽 3bit는 0으로 채워짐
		int result2 = num>>3; //오른쪽으로 3bit 이동, 왼쪽 3bit는 부호bit로 채워짐
		int result3 = num>>>3; //오른쪽으로 3bit 이동, 왼쪽 3bit는 0으로 채워짐
		System.out.println(Integer.toBinaryString(result1));
		System.out.println(Integer.toBinaryString(result2));
		System.out.println(Integer.toBinaryString(result3));
		//printf()
		System.out.printf("%08x %n", num);
		System.out.printf("%08x %n", result1);
		System.out.printf("%08x %n", result2);
		System.out.printf("%08x %n", result3);
	}
}
