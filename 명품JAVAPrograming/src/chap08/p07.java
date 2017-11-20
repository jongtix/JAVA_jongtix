package chap08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class p07 {
	public static void main(String[] args) throws Exception {
		String dir = "C:\\Users\\Public\\Pictures\\Sample Pictures\\";
		File file1 = new File(dir + "Koala.jpg");
		File file2 = new File(dir + "Koalafile_복사본.jpg");
		BufferedInputStream bisfile = new BufferedInputStream(new FileInputStream(file1));
		BufferedOutputStream bosfile = new BufferedOutputStream(new FileOutputStream(file2));
		long ten = file1.length() / 10;
		long per = 0;
		byte[] fisbuf = new byte[1024];
		int check;
		while (true) {
			check = bisfile.read(fisbuf, 0, fisbuf.length);
			if (check == -1) {
				if (per > 0) {
					System.out.print("*");
				}
				break;
			}
			if (check > 0) {
				bosfile.write(fisbuf, 0, check);
				per += check;
			}
			if (per >= ten) {
				System.out.print("*");
				per = 0;
			}
		}
		bosfile.flush();
		bosfile.close();
		bisfile.close();

		System.out.println("복사 완료");
	}
}
