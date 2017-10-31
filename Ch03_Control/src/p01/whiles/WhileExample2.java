package p01.whiles;

import java.io.IOException;

/**
 * 
 */
public class WhileExample2 {
	public static void main(String[] args) {
		System.out.println("값을 입력하세요.");
		try {
			int num = System.in.read() - '0'; //입출력 처리는 예외가 발생할 수 있음.
											  //IOException 예외 발생시 처리해주는 문장이 필요.
											  //checkedException
											  //실행시에 발생할 수 있는 예외를 미리 체크해서
											  //처리할 catch() {} 문을 추가함.
											  
											  //read(): 입력값 ASCII코드값을 리턴
											  //ASCII코드값 - '0'의 ASCII코드값 => int타입의 변수에 대입
			int i = 1;
			if (num >= 2 && num <= 9) { //입력한 값이 2 ~ 9 사이이면
				while (i <= 9) { //9까지 출력
					System.out.print(num + " x " + i + " = " + num * i + "\t");
					i++;
				}
			} else {
				System.out.println("2 ~ 9까지의 숫자를 입력하세요.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
