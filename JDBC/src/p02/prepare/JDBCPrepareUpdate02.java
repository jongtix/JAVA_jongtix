package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCPrepareUpdate02 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/mydatabase01", user = "user11", password = "user11";
		String sql = "update board set title = ?, readcount = readcount + 1, favor = favor + 1 where no = ?;";
		
		try {
			Scanner scanner = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.print("수정할 글 번호 > ");
			int no = scanner.nextInt();
			System.out.print("수정할 제목 > ");
			String title = scanner.next();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setInt(2, no);
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
//			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
