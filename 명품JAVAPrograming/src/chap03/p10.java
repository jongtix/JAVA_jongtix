package chap03;

import java.util.Random;

public class p10 {
	public static void main(String[] args) {
		int[][] intArr = new int[4][4];
		int[] randomArr; // randonNum이 들어갈 위치.
		randomArr = new Random().ints(0, 16).distinct().limit(10).toArray();
		
//		randomArr 확인
//		for (int i = 0; i < randomArr.length; i++) {
//			System.out.println(randomArr[i] + "\t" + randomArr[i]/4 + "\t" + randomArr[i]%4);
//		}
//		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			int locationI = randomArr[i] / 4;
			int locationJ = randomArr[i] % 4;
			intArr[locationI][locationJ] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				System.out.print(intArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
