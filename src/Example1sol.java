
public class Example1sol {
	public static void main(String[] args) {
		// 1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (j%2 == 0) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 2
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 14; j++) {
				if ((j+i)%2 == 0) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 3
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < i * 2 + 1; j++) {
				if (j%2 == 0) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 4
		for (int i = 0; i < args.length; i++) {
			
		}
	}
}
