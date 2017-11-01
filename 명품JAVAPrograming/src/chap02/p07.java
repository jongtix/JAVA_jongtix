package chap02;

import java.util.Scanner;

public class p07 {
	public static void main(String[] args) {
		System.out.println("점 (x,y)의 좌표를 입력하시오. >>");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		if (x <= 200 && x >= 100) {
			if (y <= 200 && y >= 100) {
				System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
			} else {
				System.out.println("(" + x + "," + y + ")는 사각형 밖에 있습니다.");
			}
		} else {
			System.out.println("(" + x + "," + y + ")는 사각형 밖에 있습니다.");
		}
	}
}
