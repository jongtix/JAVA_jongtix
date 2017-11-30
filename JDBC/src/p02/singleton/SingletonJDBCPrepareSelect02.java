package p02.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * scrollable ResultSet
 * - 쿼리의 결과를 위/아래로 커서로 이동하여 출력할 수 있는 객체
 * 
 * */
public class SingletonJDBCPrepareSelect02 {
	public static void main(String[] args) {
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		try {
			conn = Connections001.getInstance().getConnection();
			String sql = "select * from goods";
			pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = pstmt.executeQuery();
			System.out.println("next() 실행");
			while (rs.next()) {
				System.out
						.println("no : " + rs.getInt(1) + ", name : " + rs.getString(2) + ", price : " + rs.getInt(3));
			}
			System.out.println("previous() 실행");
			while (rs.previous()) {
				System.out
						.println("no : " + rs.getInt(1) + ", name : " + rs.getString(2) + ", price : " + rs.getInt(3));
			}
			System.out.println("first() 실행");
			rs.first();
			System.out.println("no : " + rs.getInt(1) + ", name : " + rs.getString(2) + ", price : " + rs.getInt(3));
			System.out.println("last() 실행");
			rs.last();
			System.out.println("no : " + rs.getInt(1) + ", name : " + rs.getString(2) + ", price : " + rs.getInt(3));
			System.out.println("absolute(5) 실행");
			rs.absolute(5);
			System.out.println("no : " + rs.getInt(1) + ", name : " + rs.getString(2) + ", price : " + rs.getInt(3));
			rs.close();
			pstmt.close();
			conn.close();
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
