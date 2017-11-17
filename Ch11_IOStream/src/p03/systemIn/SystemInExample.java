package p03.systemIn;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {
	public static void main(String[] args) {
		System.out.println("=== 메뉴 ===");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("메뉴를 선택하세요 : ");
		
		InputStream is = System.in; // 키보드로부터 byte 단위의 값을 입력받는 입력 스트림
		try {
			char inputChar = (char) is.read();
			switch (inputChar) {
			case '1':
				System.out.println("에금조회 선택");
				break;
			case '2':
				System.out.println("예금출금 선택");
				break;
			case '3':
				System.out.println("예금입금 선택");
				break;
			case '4':
				System.out.println("종료 선택");
				break;
			}
		} catch (Exception e) {
			
		};
	}
}
