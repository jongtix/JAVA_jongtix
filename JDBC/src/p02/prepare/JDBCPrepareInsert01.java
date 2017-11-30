package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCPrepareInsert01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:mysql://localhost:3306/mydatabase001", user = "user11", password = "user11";
		String sql = "insert into goods(id, name, price, category, maker_makercd) values(?, ?, ?, ?, ?);";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			Scanner scanner = new Scanner(System.in);
			System.out.println("제품번호 > ");
			int id = scanner.nextInt();
			System.out.println("제품명 > ");
			String name = scanner.next();
			System.out.println("가격 > ");
			int price = scanner.nextInt();
			System.out.println("제품 분류 > ");
			int category = scanner.nextInt();
			System.out.println("제조사코드 > ");
			int maker_makercd = scanner.nextInt();
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, price);
			pstmt.setInt(4, category);
			pstmt.setInt(5, maker_makercd);
			
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("성공!");
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
