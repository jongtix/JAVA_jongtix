package p01.arrayList;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// 자료추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DATABASE");
		list.set(0, "HTML");
		list.add("iBatis");
		
		// 추가된 자료의 갯수확인
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		
		// 특정 index 번지의 값을 출력 get(index)
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		
		// 전체 객체 출력
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.print(str + " ");
		}
	}
}
