package chap03;

public class p09 {
	public static void main(String[] args) {
		int[][] intArr = new int[4][4];
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[i].length; j++) {
				intArr[i][j] = (int) (Math.random() * 10 + 1);
				System.out.print(intArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
