package p01.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample4 {
	public static void main(String[] args) {
		// 입력 받은 초기값으로 List를 만드는 메소드 asList(T ... a);
		// 메소드 : 리턴타입 메소드명(매개변수) {실행부};
		// 입력되는 매개변수의 갯수를 알 수 없을 때 (T ... a)
		// -> 입력되는 타입의 갯수에 따라 배열이 만들어짐
		// String [] str = { "홍길동", "일지매", "임꺽정" };
		// Arrays.asList(str);
		List<String> list = Arrays.asList("홍길동", "일지매", "임꺽정");
		for (String name : list)
			System.out.println(name);
		
		// 초기값으로 리스트를 만들 때 Arrays.asList(배열);
		String [] str = { "파이썬", "아나콘다", "보아" };
		List<String> list1 = Arrays.asList(str);
		for (String name : list1)
			System.out.println(name);
		
		Integer [] ints = { 1, 2, 3 };
		List<Integer> list2 = Arrays.asList(ints);
		for (int i : list2)
			System.out.println(i);
	}
}
