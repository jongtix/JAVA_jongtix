package chap03;

public class p07 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			sum += num[i];
		}
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		avg = (double) sum / (double) num.length;
		System.out.print("평균은 " + avg);
	}
}
