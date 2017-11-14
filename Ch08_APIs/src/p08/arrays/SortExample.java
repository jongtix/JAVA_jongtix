package p08.arrays;

import java.util.Arrays;

/**
 * Sort
 * - 기본적으로 오름차순
 * */
public class SortExample {
	public static void main(String[] args) {
		// 기본데이터 타입
		int [] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		for (int i : scores) {
			System.out.println(i);
		}
		
		// String 타입
		String [] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for (String i : names) {
			System.out.println(i);
		}
		
		// 객체 타입(Member)
		Member m1 = new Member("홍길동");
		Member m2 = new Member("홍길이");
		Member m3 = new Member("홍기리");
		Member [] members = { m1, m2, m3 };
		Arrays.sort(members);
		for (Member i : members) {
			System.out.println(i.name);
		}
	}
}
