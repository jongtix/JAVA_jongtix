package chap08;

import java.io.File;
import java.util.Scanner;

public class p13 {
	String location = "C:/";
	File file;
	File [] fileNames;
	Scanner scanner = new Scanner(System.in);
	
	p13() {
		file = new File(location);
	}
	
	void move(String location) {
		if (location.equals("그만")) {
			System.exit(0);;
		}
		if (location.equals("..")) {
			this.location = file.getParent();
		} else {
			this.location += "/" + location;
		}
		file = new File(this.location);
	}
	
	String check(File f) {
		if (f.isDirectory()) {
			return "dir";
		} else if (f.isFile()) {
			return "file";
		}
		return "";
	}
	
	void show() {
		System.out.println("[" + file.getPath() + "]");
		fileNames = file.listFiles();
		for (int i = 0; i < fileNames.length; i++) {
			System.out.println(check(fileNames[i]) + "\t" + fileNames[i].length() + "바이트\t\t" + fileNames[i].getName());
		}
	}
	
	void run() {
		System.out.println("***** 파일 탐색기입니다. *****");
		show();
		do {
			System.out.print(" >> ");
			String location = scanner.next();
			move(location);
			show();
		} while (true);
	}
	
	public static void main(String[] args) {
		p13 go = new p13();
		go.run();
	}
}
