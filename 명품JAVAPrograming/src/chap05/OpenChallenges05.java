package chap05;

public class OpenChallenges05 {
	static char[][] xy = new char[10][20];
	Bear bear;
	Fish fish;

	public OpenChallenges05() {
		bear = new Bear(0, 0, 1);
		fish = new Fish((int) (Math.random() * 20), (int) (Math.random() * 10), 1);
	}

	public static void main(String[] args) {
		OpenChallenges05 game = new OpenChallenges05();
		game.run();
	}

	void run() {
		do {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					if (bear.getX() >= 20) {
						System.out.println("그쪽으로 움직일 수 없습니다.");
						fish.cnt -= 1;
						bear.x -= bear.distance;
					} else if (bear.getX() < 0) {
						System.out.println("그쪽으로 움직일 수 없습니다.");
						fish.cnt -= 1;
						bear.x += bear.distance;
					} else if (bear.getY() >= 10) {
						System.out.println("그쪽으로 움직일 수 없습니다.");
						fish.cnt -= 1;
						bear.y -= bear.distance;
					} else if (bear.getY() < 0) {
						System.out.println("그쪽으로 움직일 수 없습니다.");
						fish.cnt -= 1;
						bear.y += bear.distance;
					}

					if (bear.getX() == j && bear.getY() == i) {
						xy[i][j] = bear.getShape();
					} else if (fish.getX() == j && fish.getY() == i) {
						xy[i][j] = fish.getShape();
					} else {
						xy[i][j] = '-';
					}

				}
			}
			for (char[] y : xy) {
				for (char x : y) {
					System.out.print(x);
				}
				System.out.println();
			}
			bear.move();
			fish.move();
			System.out.println();
		} while (!bear.collide(fish));
		for (char[] x : xy) {
			for (char y : x) {
				System.out.print(y);
			}
			System.out.println();
		}
		System.out.println("Bear Wins!! " + fish.cnt + "회");
	}
}
