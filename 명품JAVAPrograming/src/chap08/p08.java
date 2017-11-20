package chap08;

import java.io.File;
import java.util.HashMap;

public class p08 {
	public static void main(String[] args) {
		HashMap<Long, String> map = new HashMap<>();
		File c = new File("C:\\Users\\Public\\Pictures\\Sample Pictures");
		File [] allC = c.listFiles();
		for (int i = 0; i < allC.length; i++) {
			System.out.println(allC[i].getName() + "\t" + allC[i].length());
		}
		long [] length = new long[allC.length];
		for (int i = 0; i < allC.length; i++) {
			length[i] = allC[i].length();
		}
		for (int i = 0; i < allC.length; i++) {
			map.put(length[i], allC[i].getName());
		}
		for (int i = 0; i < length.length; i++) {
			for (int j = 0; j < length.length; j++) {
				long temp = length[i];
				if (length[i] > length[j]) {
					length[i] = length[j];
					length[j] = temp;
				}
			}
		}
		System.out.println("가장 큰 파일은 " + map.get(length[0]) + " "+ length[0] + "바이트");
	}
}
