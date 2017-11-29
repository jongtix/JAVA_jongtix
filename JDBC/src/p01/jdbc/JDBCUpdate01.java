package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCUpdate01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/mydatabase01", user = "user11", password = "user11";
		
		int count = 0, fcount = 0, no = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.print("수정할 글번호 입력 > ");
			no = scanner.nextInt();
			System.out.print("읽은 횟수 > ");
			count = scanner.nextInt();
			System.out.print("좋아요 수 > ");
			fcount = scanner.nextInt();
			String sql = "UPDATE board " + " SET " + "readcount = " + count + ", " + "favor = " + fcount + " WHERE " + "no = " + no + ";";
			stmt = conn.createStatement();
			System.out.println(sql);
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("수정 완료!");
				rs = stmt.executeQuery("select * from board where no = " + no + ";");
				if (rs.next()) {
					System.out.println("no : " + rs.getInt(1) + ", title : " + rs.getString(2) + ", readcount : " + rs.getInt(5) + ", favor : " + rs.getInt(7));
				}
			} else {
				System.out.println("수정 실패;");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
