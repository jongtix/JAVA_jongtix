package p08.arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char [] arr1 = { 'J' , 'A', 'V', 'A' };
		
		// 복사하기
		char [] arr2 = new char[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// 복사하기2
		char [] arr3 = Arrays.copyOf(arr1, arr1.length); // copyOf(원본배열, 복사할 길이);
		System.out.println(Arrays.toString(arr3));
		
		// 복사하기3
		char [] arr4 = Arrays.copyOfRange(arr1, 1, 3); // copyOfRange(원본배열, 시작index, 끝index);
	}
}
