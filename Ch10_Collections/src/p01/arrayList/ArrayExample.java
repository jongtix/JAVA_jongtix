package p01.arrayList;
/**
 * 배열 사용의 단점
 * 		- 크기가 초기의 크기로 고정, 자료 추가가 어려움
 * 		- 객체의 저장과 연산시 null 여부 확인
 * */
public class ArrayExample {
	public static void main(String[] args) {
		// 배열은 크기가 정해져있는 자료구조
		int [] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
//		arr1[4] = "5";
//		arr1[5] = 6;
//		arr1[7] = 7;
		for (int i : arr1)
			System.out.println(i);
		
		String [] arr3 = new String[3];
		arr3[0] = "홍길동";
		arr3[1] = "일지매";
		for (String i : arr3)
			System.out.println(i);
	}
}
