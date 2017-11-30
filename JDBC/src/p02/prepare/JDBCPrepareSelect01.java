package p02.prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 * PrepareStatement문은 statement문과 다르게 바인딩변수를 사용함
 * */
public class JDBCPrepareSelect01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/mydatabase001", user = "user11", password = "user11";
		String sql = "select * from goods where id = ?;"; // 바인딩되는 변수의 갯수만큼 ?를 표시함
														  // 바인딩 순서는 ? 순서
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql); // 접속시에 쿼리문을 미리 만듦
			Scanner scanner = new Scanner(System.in);
			System.out.print("조회할 상품 번호를 입력하세요 > ");
			int id = scanner.nextInt();
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery(); // 실행시, 이미 만들어진 (실제 변수값이 바인딩된) 쿼리를 실행
			while(rs.next()) {
				System.out.println("상품 번호 : " + rs.getInt(1) + ", 상품명 : " + rs.getString(2) + ", 가격 : " + rs.getInt(3) + ", 상품 분류 : " + rs.getInt(4) + ", 제조사코드 : " + rs.getInt(5));
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
