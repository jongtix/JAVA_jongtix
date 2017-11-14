package p08.arrays;

import java.util.Arrays;

/**
 * binarySearch를 할 때는 sort처리 필수.
 * */
public class BinarySearchExample {
	public static void main(String[] args) {
		// 기본데이터 타입
		int [] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스 : " + index);
		System.out.println("결과 : " + scores[index]);
		for (int i : scores) {
			System.out.println(i);
		}

		// String 타입
		String [] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "박동수");
		System.out.println("찾은 인덱스 : " + index);
		System.out.println("결과 : " + names[index]);
		for (String i : names) {
			System.out.println(i);
		}
		
		// 객체 타입(Member)
		Member m1 = new Member("홍길동");
		Member m2 = new Member("홍길이");
		Member m3 = new Member("홍기리");
		Member [] members = { m1, m2, m3 };
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m2);
		System.out.println("찾은 인덱스 : " + index);
		System.out.println("결과 : " + members[index].name);
		for (Member i : members) {
			System.out.println(i.name);
		}
	}
}
