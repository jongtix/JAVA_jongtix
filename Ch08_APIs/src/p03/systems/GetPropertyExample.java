package p03.systems;

import java.util.Properties;
import java.util.Set;

/**
 * getProperty() : 시스템의 속성값을 읽어내는 메소드
 * 		- 시스템의 속성들은 property 형태로 저장되어있음.
 * 		  "key : 값"의 형태로 저장
 * 			-> key와 값이 문자열(String)로 되어있는 자료구조.
 * */
public class GetPropertyExample {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈 디렉토리 : " + userHome);
		
		System.out.println();
		
		System.out.println("[key] value");
		
		System.out.println();
		
		// 프로퍼티 객체 생성
		Properties props = System.getProperties(); // system 속성들을 Properties 형태로 출력하는 메소드 (key : value)
		
		// Set 자료구조
		// 순서는 없지만 중복을 허용하지 않는 자료구조
		Set keys = props.keySet();
		for (Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "] " + value);
		}
	}
}
