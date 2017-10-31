package p01.references;
/**
 * array 점수 구하기
 * 타입[][] 2차원 배열
 */
public class ArrExample5 {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		String[] title = {"이름", "국어", "영어", "수학", "총점", "평균"};
		String[] name = {"일지매", "이순신", "임꺽정", "홍길동"};
		int[][] score = {{90, 80, 70}, {76, 86, 90}, {90, 78, 90}, {80, 80, 80}};
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
			//이름 출력
			System.out.print(name[i] + "\t");
			//점수 출력
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			System.out.print(sum + "\t");
			for (int j = 0; j < score[i].length; j++) {
				avg = (double) sum / score[i].length;
			}
			System.out.print(avg);
			sum = 0;
			System.out.println();
		}//이름 점수 출력 끝
		for (int i = 0; i < 44; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print("합계\t");
		sum = 0;
		for (int i = 0; i < score[i].length; i++) {
			for (int j = 0; j < score.length; j++) {
				sum += score[j][i];
			}
			System.out.print(sum + "\t");
			sum = 0;
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		System.out.print(sum + "\t");
		System.out.print((double) sum / 12);
	}
}
