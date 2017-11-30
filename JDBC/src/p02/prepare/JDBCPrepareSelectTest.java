package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
/**
 * PrepareStatement문은 statement문과 다르게 바인딩변수를 사용함
 * */
public class JDBCPrepareSelectTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt= null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/mydatabase01", user = "user11", password = "user11";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			String title = "테" + "%";
			String writer = "ㅁ" + "%";
			String sql = "select * from board where title like \'" + title + "\' and writer like \'" + writer + "\';"; // 바인딩되는 변수의 갯수만큼 ?를 표시함
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("글번호 : " + rs.getInt(1) + ", 제목 : " + rs.getString(2) + ", 내용 : " + rs.getString(3) + ", 글쓴이 : " + rs.getString(4) + ", 조회수 : " + rs.getString(5));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
