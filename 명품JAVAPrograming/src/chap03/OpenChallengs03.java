package chap03;

import java.util.Scanner;

public class OpenChallengs03 {
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 99);
		int cnt1 = 0;
		int cnt2 = 99;
		int cnt3 = 0;
		int num = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		do {
			cnt3++;
			System.out.println(cnt1 + "~" + cnt2);
			System.out.println(cnt3 + ">>");
			num = s.nextInt();
			if (num < cnt1 | num > cnt2) {
				System.out.println("수를 다시 확인해 주세요.");
				cnt3--;
			} else {
				if (num == randomNumber) {
					System.out.println("맞았습니다.");
					System.out.println("다시하시겠습니까?");
					String str = s.next();
					if (str.equals("y")) {
						randomNumber = (int) (Math.random() * 99);
						cnt1 = 0;
						cnt2 = 99;
						cnt3 = 0;
					} else if (str.equals("n")) {
						break;
					}
				} else if (num < randomNumber) {
					System.out.println("더 높게");
					cnt1 = num;
				} else if (num > randomNumber) {
					System.out.println("더 낮게");
					cnt2 = num;
				}
			}
		} while (true);
	}
}
