package p01.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestExample {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null)
				System.out.println("연결 성공!");
			else
				System.out.println("연결 실패;");
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
