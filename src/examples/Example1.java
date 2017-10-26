package examples;


public class Example1 {
	public static void main(String[] args) {
		String str = "#";
		String str1 = "";
		String str2 = "";
		String str3 = "# # # # # # # #";
		
		for (int i = 0; i < 5; i++) {
			str1 += str + " ";
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(str1);
		}
		System.out.println(" ");

		int j = 0;
		do {
			if(j%2 == 0) {
				System.out.println(str1 + "#");
				j++;
			} else {
				System.out.println(" # " + str1);
				j++;
			}
		} while (j < 7);
		System.out.println(" ");

		for (int i = 0; i < 8; i++) {
			 str2 += str + " ";
			 System.out.println(str2);
		}
		System.out.println(" ");
		
		int index = str3.lastIndexOf("#");
		String str4 = "";
		for (int i = index; i > 0; i -= 2) {
			str4 = str3.substring(0, i);
			System.out.println(str4);
		}
		System.out.println(" ");
		
		String str5 = "";
		for (int i = 0; i < index; i += 2) {
			str5 = "   " + str3.substring(i, index);
			System.out.println(str5);
		}
	}
}
