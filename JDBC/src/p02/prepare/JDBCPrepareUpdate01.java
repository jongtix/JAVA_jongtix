package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCPrepareUpdate01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/mydatabase001", user = "user11", password = "user11";
		String sql = "update goods set name = ?, price = ? where id = ?;";
		
		try {
			Scanner scanner = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.print("제품명 > ");
			String name = scanner.next();
			System.out.print("가격 > ");
			int price = scanner.nextInt();
			System.out.print("제품 코드 > ");
			int id = scanner.nextInt();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, price);
			pstmt.setInt(3, id);
			int result = pstmt.executeUpdate();
			sql = "select * from goods where id = ?;";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("제품명 : " + rs.getString(2) + ", 가격 : " + rs.getInt(3) + ", 제조사코드 : " + rs.getInt(5));
			} else {
				System.out.println("실패");
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
