package p02.prepare;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class JDBCPrepareDelete02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Properties props = new Properties();
		String path = JDBCPrepareDelete02.class.getResource("database.properties").getPath();
		try {
			props.load(new FileReader(path));
			String driver = props.getProperty("driver");
			String url = props.getProperty("url");
			String user = props.getProperty("user");
			String password = props.getProperty("password");
			String sql = "delete from member where no = ?;";
			Class.forName(driver.trim());
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			System.out.print("삭제할 멤버의 번호 > ");
			int no = scanner.nextInt();
			pstmt.setInt(1, no);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
