package chap08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class p12 {
	String dir = "C:\\Users\\Administrator\\Documents\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp";
	File file;
	BufferedReader br;
	Vector<String> stringLine;
	Scanner scanner = new Scanner(System.in);
	
	p12() {
		stringLine = new Vector<>();
	}
	
	void save(String location) throws Exception {
		if (location.toLowerCase().startsWith("c:")) {
			file = new File(location);
		} else {
			file = new File(dir + "\\" + location);
		}
		br = new BufferedReader(new FileReader(file));
		String line = "";
		while ((line = br.readLine()) != null) {
			stringLine.add(line);
		}
	}
	
	boolean find(String word) {
		boolean check = false;
		if (word.equals("그만")) {
			System.out.println("프로그램을 종료합니다.");
			check = false;
		}
		for (int i = 0; i < stringLine.size(); i++) {
			if (stringLine.get(i).length() >= word.length()) {
				if (stringLine.get(i).indexOf(word) != -1) {
					System.out.println(i + " : " + stringLine.get(i));
					check = true;
				}
			} else {
				check = false;
			}
		}
		return check;
	}
	
	void run() throws Exception {
		System.out.print("대상 파일명 입력 >> ");
		String location = scanner.next();
		save(location);
		do {
			System.out.print("검색할 단어나 문장 >> ");
			String word = scanner.next();
			if (!find(word)) {
				break;
			}
		} while (true);
	}
	
	
	public static void main(String[] args) throws Exception {
		p12 go = new p12();
		go.run();
	}
}
