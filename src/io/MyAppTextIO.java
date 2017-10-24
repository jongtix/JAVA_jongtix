package io;

import java.io.FileInputStream;
import java.util.Scanner;

public class MyAppTextIO {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("jeju.txt");
		Scanner scanner = new Scanner(fis);

		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}

		scanner.close();
		fis.close();
	}
}
