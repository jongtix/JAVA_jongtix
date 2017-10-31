package p01.references;
/**
 * 
 */
public class ArrExample3 {
	public static void main(String[] args) {
		String[] str = {"산토끼", "집토끼", "판토끼", "죽은토끼", "알칼리토끼"};
		for (int i = 0; i < str.length; i++) {
			if (i != str.length - 1) System.out.print(str[i] + ", ");
			else System.out.println(str[i]);
		}
		int i = 0;
		for (String j : str) {
			if (i != str.length - 1) System.out.print(j + ", ");
			else System.out.println(j);
			i++;
		}
	}
}
