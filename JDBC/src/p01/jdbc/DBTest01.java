package p01.jdbc;

import java.beans.Statement;
import java.sql.Connection; // connection 객체는 sql폴더에 있음
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest01 {
	public static void main(String[] args) {
		// 연결객체 생성
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/mydatabase01", user = "user11", password = "user11";
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 1 단계 : 드라이버 로딩
			conn = DriverManager.getConnection(url, user, password); // 2 단계 : DB연결
			System.out.println("데이터베이스에 접속했습니다."); // 3 단계 : 작업
			Statement stmt = (Statement) conn.createStatement();
			conn.close(); // 4 단계 : 연결해제
			System.out.println("접속을 종료합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se.getMessage()); // sql오류 메시지
		}
	}
}
