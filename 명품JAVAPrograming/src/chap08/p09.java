package chap08;

import java.io.File;

public class p09 {
	public static void main(String[] args) {
		String dir = "C:\\Users\\Administrator\\Documents\\JAVAjongtix\\명품JAVAPrograming\\src\\chap08\\temp";
		String txt = ".txt";
		System.out.println(dir + "디렉터리의 " + txt + " 파일을 모두 삭제합니다....");
		File directory = new File(dir);
		File [] fileList = directory.listFiles();
		int count = 0;
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getName().indexOf(txt) != -1) {
				System.out.println(fileList[i].getPath() + " 삭제");
				fileList[i].delete();
				count++;
			}
		}
		System.out.println("총 " + count + "개의 " + txt + " 파일을 삭제하였습니다.");
	}
}
