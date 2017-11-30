package p02.singleton;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import p02.prepare.JDBCPrepareDelete02;

/**
 * 하나의 객체를 공유하여 사용
 * 데이터 접속에 일관성을 유지
 * Connection conn1 = DriverManager.getConnection();
 * Connection conn2 = DriverManager.getConnection();
 * */
public class Connections001 {
	// 필드 - private static 자신타입필드명;
	private static Connections001 instance;

	// 생성자 - private 생성자
	private Connections001() {
		
	}

	// 메소드 - public static 자신타입getInstance() {}
	public static Connections001 getInstance() {
		if (instance == null)
			instance = new Connections001();
		return instance;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Properties props = new Properties();
		String path = JDBCPrepareDelete02.class.getResource("database001.properties").getPath();
		try {
			props.load(new FileReader(path));
			String driver = props.getProperty("driver");
			String url = props.getProperty("url");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			Class.forName(driver.trim());
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
