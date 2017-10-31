package p01.dowhile;

import java.util.Scanner;

/**
 * do-while()문
 * 오늘의 과제 - 반복 횟수(5회) 이상이면 종료되는 p/g으로 수정하세요.
 */
public class DoExample4 {
	public static void main(String[] args) {
		int random = (int) (Math.random()*100 + 1);
		int cnt = 0, num;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("1 ~ 100까지의 수 중 어느 수 일까요?");
			num = s.nextInt();
			cnt++;
			if (num == random) {
				System.out.println(cnt + "회 만에 성공!");
				break;
			} else if (num < random) {
				System.out.println("값이 너무 작습니다.");
			} else {
				System.out.println("값이 너무 큽니다.");
			}
			if (cnt == 5) {
				System.out.println("5회를 넘었습니다.");
				break;
			}
		} while (true);
		s.close();
	}
}
