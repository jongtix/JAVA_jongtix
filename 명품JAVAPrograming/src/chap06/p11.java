package chap06;

import java.util.Scanner;

public class p11 {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		p11 start = new p11();
		start.run();
	}
	
	void run() {
		System.out.print(">>");
		String str = scanner.nextLine();
		do {
			System.out.print("명령: ");
			String commendStr = scanner.nextLine();
			if (commendStr.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			String [] commend = new String[2]; 
			commend[0] = commendStr.split("!")[0];
			commend[1] = commendStr.split("!")[1];
			if (commend[0].equals("")) {
				System.out.println("잘못된 명령입니다!");
			} else {
				StringBuffer strBuf = new StringBuffer(str); 
				if (strBuf.indexOf(commend[0]) < 0) {
					System.out.println("찾을 수 없습니다!");
				} else {
					strBuf.replace(strBuf.indexOf(commend[0]), strBuf.indexOf(commend[0]) + commend[0].length() + 1, commend[1] + " ");
					System.out.println(strBuf);
				}
				
			}
		} while (true);
	}
}
