package p01.operations;
/**
 * 비트연산 
 */
public class BitOperExample4 {
	public static void main(String[] args) {
		int num1 = 0xFFFFFFFE;
		System.out.println(Integer.toBinaryString(num1));
		int num11 = num1>>>1;
		int num12 = num1>>>2;
		System.out.println(Integer.toBinaryString(num11));
		System.out.println(Integer.toBinaryString(num12));
		int num2 = num1>>>30;
		int num3 = num1>>>31;
		int num4 = num1>>>32;
		int num5 = num1>>>33;
		int num6 = num1>>>34;
		System.out.println(Integer.toBinaryString(num2));
		System.out.println(Integer.toBinaryString(num3));
		System.out.println(Integer.toBinaryString(num4));
		System.out.println(Integer.toBinaryString(num5));
		System.out.println(Integer.toBinaryString(num6));
		
	}
}
