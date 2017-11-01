package chap02;

import java.util.Scanner;

public class p08 {
	public static void main(String[] args) {
		System.out.println("두 점의 좌표를입력하세요.>>");
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt(), y1 = s.nextInt(), x2 = s.nextInt(), y2 = s.nextInt();
		
		boolean d1 = inRect(x1, y1, 100, 100, 200, 200);
		boolean d2 = inRect(x2, y2, 100, 100, 200, 200);
		
		if (d1 == true || d2 == true) {
			System.out.println("두 사각형이 충돌합니다.");
		} else {
			System.out.println("두 사각형은 충돌하지 않습니다.");
		}
	}
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
			return true;
		} else {
			return false;
		}
	}
}
