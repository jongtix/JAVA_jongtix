package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 * PrepareStatement문은 statement문과 다르게 바인딩변수를 사용함
 * */
public class JDBCPrepareSelect03 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/mydatabase01", user = "user11", password = "user11";
		String sql = "select * from board where title like ? and writer like ?;"; // 바인딩되는 변수의 갯수만큼 ?를 표시함
														  // 바인딩 순서는 ? 순서
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql); // 접속시에 쿼리문을 미리 만듦
			String title = "테" + "%";
			String writer = "ㅁ" + "%";
			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			rs = pstmt.executeQuery(); // 실행시, 이미 만들어진 (실제 변수값이 바인딩된) 쿼리를 실행
			while(rs.next()) {
				System.out.println("글번호 : " + rs.getInt(1) + ", 제목 : " + rs.getString(2) + ", 내용 : " + rs.getString(3) + ", 글쓴이 : " + rs.getString(4) + ", 조회수 : " + rs.getString(5));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
