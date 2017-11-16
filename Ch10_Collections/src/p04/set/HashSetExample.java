package p04.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set - 자료를 중복저장하지 않는 자료구조
 * 	   - 순서가 없음
 * */
public class HashSetExample {
	public static void main(String[] args) {
		// Set 객체 생성
		Set<String> set = new HashSet<>(); // HashSet 객체 생성 후 Promotion
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 동일한 객체의 중복 저장 안됨.
		set.add("iBatis");
		
		int size = set.size(); // 저장된 객체의 갯수
		System.out.println("총 객체의 갯수 : " + size);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(new Integer(1)); // 객체 저장 Wrapper 클래스
		set2.add(1); // int타입 정수 -> Wrapper 크랠스 : auto-Boxing
		set2.add(2);
		set2.add(new Integer(3));
		
		size = set2.size();
		System.out.println("총 객체의 갯수 : " + size);
		
		Iterator<String> iterator = set.iterator(); // set에서 자료를 얻어내기 위해서 반복자를 생성
		while (iterator.hasNext()) {
			String e1 = iterator.next(); // next()값을 가져오는 메소드
			System.out.print(e1 + " ");
		}
		System.out.println();
		Iterator<Integer> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Integer e2 = iterator2.next();
			System.out.print(e2 + " ");
		}
	}
}
