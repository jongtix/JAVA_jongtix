package examples;

public class ArrayEx {
	public static void main(String[] args) {
		int[] myArray = new int[5];
		myArray[0] = 1;
		myArray[1] = 42;
		myArray[2] = 66;
		myArray[3] = 60;
		myArray[4] = 46;
//		myArray[5] = 43;
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		System.out.println(myArray[4]);
//		System.out.println(myArray[5]);
		
		byte[] byteArray = new byte[3];
		byteArray[0] = 123;
		byteArray[1] = 21;
		System.out.println(byteArray);
		System.out.println(byteArray[0]);
		System.out.println(byteArray[1]);
		System.out.println(byteArray[2]);
		
//		int i;
//		System.out.println(i);
		
		int[] myArray2 = {2, 123, 324, -123};
		System.out.println(myArray2.length);
		
		String str = "오늘 날시가 좋다.";
		System.out.println(str);
		String[] strArray = new String[3];
		strArray[0] = "월요일";
		strArray[1] = "화요일";
		strArray[2] = "수요일";
		
		String[][] names = {
				{"Mr.", "Mrs.", "Ms."},
				{"Smith", "Jones"}
		};
		System.out.println(names[1][0]);
	}
}
