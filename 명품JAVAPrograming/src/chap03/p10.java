package chap03;

public class p10 {
	public static void main(String[] args) {
		int[][] intArr = new int[4][4];
		int[] randomNum = new int[10];
		for (int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < 16; i++) {
			int location = (int) (Math.random() * 16 + 1);
			int locationI = location / 4 - 1;
			int locationJ = location % 4;
//			if ()
		}
	}
}
