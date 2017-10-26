package p03.dataTypes;

public class DataType2Example {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE; //int의 최고값
		int j = Integer.MIN_VALUE; //int의 최고값
		System.out.println(i);
		System.out.println(j);
		System.out.println(i + j);
		System.out.println(i + 1);
		System.out.println(j - 1);
		
		//byte 타입은 최소값이 -128, 최대값이 127
		// -128부터 127까지 반복됨.
		byte var1 = 127;
		for (int k = 1; k < 500; k++) {
			System.out.println(var1++); //
		}
	}
}
