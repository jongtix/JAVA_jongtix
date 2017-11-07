package chap04;

import java.util.Arrays;
import java.util.Scanner;

public class p08 {
	private static Phone[] phone;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("인원수>>");
		int many = scanner.nextInt();
		p08 phonebook = new p08(many);
		phonebook.run();
	}

	p08(int howMany) {
		phone = new Phone[howMany];
		for (int i = 0; i < phone.length; i++) {
			phone[i] = new Phone();
		}
	}

	void run() {
		String name;
		String tel;
		for (int i = 0; i < phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸 없이 입력)>>");
			phone[i].setName(scanner.next());
			phone[i].setTel(scanner.next());
		}
		String[] names = new String[phone.length]; 
		for (int i = 0; i < phone.length; i++) {
			names[i] = phone[i].getName();
		}
		System.out.println("저장되었습니다...");
		for (String e : names) {
			System.out.println(e);
		}
		do {
			System.out.print("검색할 이름>>");
			name = scanner.next();
			if (name.equals("그만")) {
				break;
			} else if (Arrays.asList(names).contains(name)) {
				for (int i = 0; i < phone.length; i++) {
					if (name.equals(phone[i].getName())) {
						System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel() + " 입니다.");
					}
				}
			} else {
				System.out.println(name + "이 없습니다.");
			}
		} while (true);
	}
}

class Phone {
	private String name;
	private String tel;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel() {
		return this.tel;
	}
	
	public void show() {
		
	}

}