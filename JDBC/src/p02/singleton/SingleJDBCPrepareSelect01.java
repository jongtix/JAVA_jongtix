package p02.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SingleJDBCPrepareSelect01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select no, name from member where flag <> \'n\';";
		try {
			conn = Connections01.getInstance().getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println("회원 번호 : " + no + ", 회원명 : " + name);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			
		}
	}
}
