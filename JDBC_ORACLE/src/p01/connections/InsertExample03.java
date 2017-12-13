package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * insert문 executeUpdate(); 사용
 */
public class InsertExample03 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			Connection conn = Connections.getInstance().getConnections();
			String sql = "insert into emp values(emp_seq12.nextval, ?, ?, ?, sysdate, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			System.out.print("이름을 입력하세요.");
			pstmt.setString(1, scanner.next());
			System.out.print("job을 입력하세요.");
			pstmt.setString(2, scanner.next());
			System.out.print("매니져의 사원번호를 입력하세요.");
			pstmt.setInt(3, scanner.nextInt());
			System.out.print("급여를 입력하세요.");
			pstmt.setInt(4, scanner.nextInt());
			System.out.print("Commission을 입력하세요.");
			pstmt.setInt(5, scanner.nextInt());
			System.out.print("부서번호를 입력하세요.");
			pstmt.setInt(6, scanner.nextInt());
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
