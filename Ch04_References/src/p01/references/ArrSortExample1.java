package p01.references;

/**
 * sort문
 */
public class ArrSortExample1 {
	public static void main(String[] args) {
		int[] num = { 76, 45, 34, 89, 100, 50, 90, 92 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("{ ");
		for (int i = 0; i < num.length; i++) {
			if (i != num.length - 1)
				System.out.print(num[i] + ", ");
			else
				System.out.print(num[i]);
		}
		System.out.print(" }\n");

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("{ ");
		for (int i = 0; i < num.length; i++) {
			if (i != num.length - 1)
				System.out.print(num[i] + ", ");
			else
				System.out.print(num[i]);
		}
		System.out.print(" }\n");
	}
}
