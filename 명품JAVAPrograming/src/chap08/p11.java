package chap08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class p11 {
	public static void main(String[] args) throws Exception {
		Vector<String> words = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		File f = new File(
				"C:\\Users\\Administrator\\Documents\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp\\words.txt");
		BufferedReader reader = new BufferedReader(new FileReader(f));
		String readLine;
		while ((readLine = reader.readLine()) != null) {
			words.add(readLine);
		}
		reader.close();
		System.out.println(f.getPath() + " 파일을 읽었습니다...");
		do {
			System.out.print("단어 >> ");
			String find = scanner.next();
			if (find.equals("그만")) {
				System.out.println("종료합니다....");
				break;
			}
			for (int i = 0; i < words.size(); i++) {
				if (words.get(i).length() >= find.length()) {
					if (words.get(i).substring(0, find.length() - 1).equals(find)) {
						System.out.println(words.get(i));
					}
				}
			}

		} while (true);

	}
}
