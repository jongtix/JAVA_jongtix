package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateExample01 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection conn = Connections.getInstance().getConnections();
			String sql = "update emp set sal = sal * 1.05 where deptno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			System.out.println("부서번호를 입력하세요.");
			pstmt.setInt(1, scanner.nextInt());
			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("업데이트 성공");
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
