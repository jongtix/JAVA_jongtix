package p05.map;

import java.io.FileReader;
import java.util.Properties;
/**
 * Property <String, String> 형태의 자료구조
 * - 주로 시스템 정보나, 알림메시지 용도로 사용되는 파일에 적용하여 사용
 * - ~.properties 파일로 저장됨.
 * - 영어는 영문자 그대로 저장되고, 한글은 unicode형태로 저장됨.
 * */
public class PropertiesExample {
	public static void main(String[] args) {
		// 프로퍼티 객체 생성
		Properties props = new Properties();
		// 파일의 상대 경로
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		// getProperty(key) => 값이 리턴
		try {
			props.load(new FileReader(path));
			
			String driver = props.getProperty("driver");
			String url = props.getProperty("url");
			String username = props.getProperty("username");
			String password = props.getProperty("password");

			System.out.println("driver : " + driver);
			System.out.println("url : " + url);
			System.out.println("username : " + username);
			System.out.println("password : " + password);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
