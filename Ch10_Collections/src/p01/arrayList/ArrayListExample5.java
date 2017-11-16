package p01.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample5 {
	public static void main(String[] args) {
		// 홍길동, 일지매, 임꺽정, 이순신 값을 입력 받아서
		// 리스트로 만들고 index번호 0번지의 값을 삭제하는 코드
		List<String> name = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print(">> ");
			String str = scanner.next();
			if (name.size() != 0) {
				name.add(str);
				name.remove(0);
				System.out.println(name.get(0));
			} else {
				name.add(str);
				System.out.println(name.get(0));
			}
			if (str.equals("이순신")) break;
		} while (true);
	}
}
