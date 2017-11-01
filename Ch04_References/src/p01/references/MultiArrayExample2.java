package p01.references;

/**
 * 2 차원 배열
 */
public class MultiArrayExample2 {
	public static void main(String[] args) {
		//길이가 3인 1 차원 배열의 초기값으로 3 행의 2 차원 배열 생성
		int[][] a = { { 12, 45, 23 }, { 16, 4, 879 }, { 45, 87, 12 } };
		//a[0][0] = 12, a[0][1] = 45, a[0][2] = 23
		//a[1][0] = 16, a[1][1] = 4,  a[1][2] = 879
		//a[2][0] = 45, a[2][1] = 87, a[2][2] = 12
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "] = " + a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		//향상된 for문을 이용한 배열요소의 출력
		int cnt1 = 0, cnt2 = 0;
		for (int[] i : a) {
			for (int j : i) {
				System.out.print("a[" + cnt1 + "][" + cnt2 + "] = " + j + "\t");
				cnt2++;
			}
			cnt2 = 0;
			cnt1++;
			System.out.println();
		}
	}
}
