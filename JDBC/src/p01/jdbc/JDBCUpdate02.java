package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
/**
 * 글번호만 입력받고 해당 글번호의 readcount와 favor를 1씩 증가시킨 후 결과 출력
 * */
public class JDBCUpdate02 {
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
//			rs = stmt.executeQuery("select * from board where no = " + no + ";");
//			if(rs.next()) {
//				count = rs.getInt(5);
//				fcount = rs.getInt(7);
//			}
			String sql = "UPDATE board " + " SET " + "readcount = readcount + 1, favor = favor + 1 WHERE no = " + no + ";";
			stmt = conn.createStatement();
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
