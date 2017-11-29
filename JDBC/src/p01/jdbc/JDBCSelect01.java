package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JDBCSelect01 {
	public static void main(String[] args) {
		// Connection 객체 생성
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/mydatabase001", user = "user11", password = "user11";
		// 쿼리 전송 객체
		Statement stmt = null;
		// 쿼리 결과 객체
		ResultSet rs = null;
		// 쿼리 스트링
		String sql = "select * from goods";
		
		try {
			// 1 단계 : 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2 단계 : DB연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스에 접속했습니다.");
			
			// 3 단계 : 작업
			// 1. statement 객체 생성
			stmt = conn.createStatement();
			// 2. statement문 실행 및 결과 얻기
			rs = stmt.executeQuery(sql);
			// 3. 쿼리 결과 다음 객체에서 자료 추출
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				int category = rs.getInt("category");
				int makercd = rs.getInt("maker_makercd");
				if (name.length() <= 4) {
					System.out.println("|" + id + "|" + name + "\t|" + category + "|" + price + "|" + makercd + "|"); 
				} else {
					System.out.println("|" + id + "|" + name + "|" + category + "|" + price + "|" + makercd + "|");
				}
			}
			System.out.println("|______________________________________________________________________|");
			
			// 4 단계 : 연결해제
			rs.close();
			stmt.close();
			conn.close();
			System.out.println("접속을 종료합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage()); // sql오류 메시지
		}
	}
}
