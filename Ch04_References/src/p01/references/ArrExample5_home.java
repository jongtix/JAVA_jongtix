package p01.references;

public class ArrExample5_home {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		String[] title = { "이름", "국어", "영어", "수학", "총점", "평균" };
		String[] name = { "일지매", "이순신", "임꺽정", "홍길동" };
		int[][] score = { { 90, 80, 70 }, { 76, 86, 90 }, { 90, 78, 90 }, { 80, 80, 80 } };
		int[] all = new int[3];
		System.out.println("성적표\n");
		for (String t : title) {
			System.out.print(t + "\t");
		}
		System.out.println();
		for (int i = 0; i < 44; i++) {
			System.out.print("=");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			// 이름 출력
			System.out.print(name[i] + "\t");
			// 점수 출력
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				all[j] += score[i][j];
			}
			//총점 출력
			avg = (double) sum / (double) score[i].length;
			System.out.print(sum + "\t" + avg);
			sum = 0;
			System.out.println();
		}
		for (int i = 0; i < 44; i++) {
			System.out.print("=");
		}
		System.out.println();
		int alltot = 0;
		System.out.print("합계\t");
		for (int i = 0; i < all.length; i++) {
			System.out.print(all[i] + "\t");
			alltot += all[i];
		}
		System.out.print(alltot + "\t" + ((double) alltot / (all.length * score.length)));
	}
}
