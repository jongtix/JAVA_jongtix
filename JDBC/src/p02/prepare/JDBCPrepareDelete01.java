package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCPrepareDelete01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/mydatabase01", user = "user11", password = "user11";
		String sql = "delete from board where no = ?;";
		
		try {
			Scanner scanner = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			pstmt = conn.prepareStatement(sql);
			System.out.print("삭제할 글 번호 > ");
			int no = scanner.nextInt();
			pstmt.setInt(1, no);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
