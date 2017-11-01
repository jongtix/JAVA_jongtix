package p01.references;

/**
 * 가변길이 이차원 배열
 */
public class MultiArrayExample4 {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		int[][] a = { { 12, 34, 32 }, { 21, 54, 76, 23 }, { 12, 65 } }; //1 차원 초기값으로 2 차원 배열 생성
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "] = " + a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//향상된 for문
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		for (int[] i : a) {
			for (int j : i) {
				System.out.print("a[" + cnt1 + "][" + cnt2 + "] = " + j + "\t");
				sum += j;
				cnt2++;
				cnt3++;
			}
			cnt2 = 0;
			cnt1++;
			System.out.println();
		}
		System.out.println();
		
		//sum & avg
		avg = (double) sum / (double) cnt3;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
