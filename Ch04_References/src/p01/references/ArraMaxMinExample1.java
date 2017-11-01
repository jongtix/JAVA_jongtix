package p01.references;

public class ArraMaxMinExample1 {
	public static void main(String[] args) {
		int[] num = { 76, 45, 34, 89, 100, 50, 90, 92 };
		int sum = 0;
		int max = Integer.MIN_VALUE; //max변수의 초기값은 배열보다 현저하게 작은 값
		int min = Integer.MAX_VALUE; //min변수의 초기값은 배열보다 현저하게 큰 값
		//int타입의 배열에서 최솟값, 최댓값 구하는 간단한 방법
		for (int i = 0; i < num.length; i++) {
			sum += num[i]; //합계
			if (num[i] > max) max = num[i];
			if (num[i] < min) min = num[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (sum / num.length));
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
