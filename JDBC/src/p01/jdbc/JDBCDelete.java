package p01.jdbc;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDelete {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Properties props = new Properties();
		String path = JDBCDelete.class.getResource("database.properties").getPath();
		String url = "", user = "", password = "";
		try {
			props.load(new FileReader(path));
			
			url = props.getProperty("url");
			user = props.getProperty("user");
			password = props.getProperty("password");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		int no = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			System.out.println("삭제할 글번호 > ");
			no = scanner.nextInt();
			String sql = "delete from board where no = " + no + ";";
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("삭제성공!");
				rs = stmt.executeQuery("select * from board;");
				while (rs.next()) {
					System.out.println("no : " + rs.getInt(1) + ", title : " + rs.getString(2) + ", writer : "+ rs.getString(4));
				}
			} else {
				System.out.println("삭제실패!");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
