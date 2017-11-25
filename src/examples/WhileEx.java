package examples;

public class WhileEx {
	public static void main(String[] args) {
		int age = 20;
		while (age > 15) {
			System.out.println("hi");
			age--;
		}
		
		do {
			System.out.println("hi");
		} while (age > 15);
	}
}
