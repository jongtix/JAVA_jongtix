package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * insert / update / delete executeUpdate();
 * executeUpdate() 메소드는 반영된 행(row)의 수를 리턴함.
 * */
public class JDBCInsert02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/mydatabase01", user = "user11", password = "user11";
		String sql = "insert into board(title, content, writer) values(";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.print("게시글 제목 입력 > ");
			String title = scanner.next();
			sql += "\'" + title + "\'";
			System.out.print("게시글 내용 입력 >");
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
			} else {
				System.out.println("저장에 실패하였습니다.");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
