package chpa05;

public class Fish extends GameObject {
	static int cnt;

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		cnt = 0;
	}

	@Override
	public void move() {
		if (cnt % 5 == 3 || cnt % 5 == 4) {
			do {
				int move = (int) (Math.random() * 4);
				if (move == 0) {
					if (this.x == 19) {
						cnt--;
						continue;
					}
					this.x += distance;
					break;
				} else if (move == 1) {
					if (this.x == 0) {
						cnt--;
						continue;
					}
					this.x -= distance;
					break;
				} else if (move == 2) {
					if (this.y == 9) {
						cnt--;
						continue;
					}
					this.y += distance;
					break;
				} else if (move == 3) {
					if (this.y == 0) {
						cnt--;
						continue;
					}
					this.y -= distance;
					break;
				}
			} while (true);
		}
		cnt++;
	}

	@Override
	public char getShape() {
		return '@';
	}

}
