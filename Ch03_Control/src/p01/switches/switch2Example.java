package p01.switches;

import java.util.Scanner;

/**
 * switch()문 - break;문을 만나지 않으면 다음 case문을 계속 실행함
 */
public class switch2Example {
	public static void main(String[] args) {
		int calNum = -1;
		String season = "";
		while (true) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("계절이 궁금한 달을 입력하세요.");
			calNum = keyboard.nextInt();
			switch (calNum) {
			case 12:
			case 1:
			case 2:
				season = "겨울";
				break;

			case 3:
			case 4:
			case 5:
				season = "봄";
				break;

			case 6:
			case 7:
			case 8:
				season = "여름";
				break;

			case 9:
			case 10:
			case 11:
				season = "가을";
				break;

			}
			System.out.println("해당 월은 " + season + "에 속합니다.");
		}
	}
}