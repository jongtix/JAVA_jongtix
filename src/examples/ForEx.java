package examples;

public class ForEx {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		int[] array = {2, 3, 4, 5};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		String[][] names = {
				{"Mr.", "Mrs.", "Ms."},
				{"Smith", "Jones"}
		};
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
		
		for (String[] y : names) {
			for (String x : y) {
				System.out.println(x);
			}
		}
		
		int age = 20;
		String str = age > 15 ? "too old" : "too young";
		System.out.println(str);
	}
}
