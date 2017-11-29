package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * insert / update / delete executeUpdate(); executeUpdate() 메소드는 반영된 행(row)의 수를
 * 리턴함.
 */
public class JDBCInsert03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null; // 최대글번호, 쿼리 결과

		String url = "jdbc:mysql://localhost:3306/mydatabase01", user = "user11", password = "user11";
		String sql = "insert into board(no, title, content, writer) values(";
		String maxValQuery = "select max(no) from board;"; // 글 번호의 최댓값
		int maxNo = 0;
		String sql2 = "select * from board where no = ";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			// 게시글 최대 번호
			stmt = conn.createStatement();
			rs = stmt.executeQuery(maxValQuery);
			if (rs.next()) {
				maxNo = rs.getInt(1) + 1;
			}
			rs.close();

			sql += maxNo;
			System.out.print("게시글 제목 입력 > ");
			String title = scanner.next();
			sql += ", \'" + title + "\'";
			System.out.print("게시글 내용 입력 > ");
			String content = scanner.next();
			sql += ", \'" + content + "\'";
			System.out.print("게시글 작성자 입력 > ");
			String writer = scanner.next();
			sql += ", \'" + writer + "\');";
			System.out.println(sql);
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("저장이 완료되었습니다.");
				sql2 += maxNo + ";";
				rs = stmt.executeQuery(sql2);
				if (rs.next()) { // <- 시작이 0이기 때문에 사용
					System.out.println("글번호 : 제목 : 내용 : 작성자 ");
					System.out.println(
							rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : " + rs.getString(4));
				}
			} else {
				System.out.println("저장에 실패하였습니다.");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
