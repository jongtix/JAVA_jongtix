package p01.connections;
/**
 * singleton
 * */

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Connections {
	private static Connections instance;
	static String driver, url, user, password;
	
	public Connections() {
	}

	public static Connections getInstance() {
		if (instance == null) {
			instance = new Connections();
		}
		return instance;
	}
	
	public static Connection getConnections() {
		Connection conn = null;
		try {
			Properties prop = new Properties();
			String path = Connections.class.getResource("database.properties").getPath();
			prop.load(new FileReader(path));
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
