package chpa05;

import java.util.Scanner;

public class Bear extends GameObject {

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	public void move() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이동 방향을 입력하세요.>>");
		String move = scanner.next();
		if (move.equals("a")) {
			this.x -= distance;
		} else if (move.equals("d")) {
			this.x += distance;
		} else if (move.equals("w")) {
			this.y -= distance;
		} else if (move.equals("s")) {
			this.y += distance;
		}
	}

	@Override
	public char getShape() {
		return 'B';
	}

}
