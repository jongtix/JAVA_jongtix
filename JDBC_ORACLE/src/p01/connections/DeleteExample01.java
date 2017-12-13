package p01.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteExample01 {
	public static void main(String[] args) {
		try {
			Connection conn = Connections.getInstance().getConnections();
			String sql = "delete emp where empno = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int empno = Integer.parseInt(getParameters());
			pstmt.setInt(1, empno);
			boolean yes = getYesNo(empno);
			if (yes == true) {
				int result = pstmt.executeUpdate();
				if (result > 0) {
					System.out.println("삭제 성공");
				}
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static boolean getYesNo(int empno) {
		System.out.println("삭제할 사원의 사원번호는 " + empno + "입니다.");
		System.out.println("정말 삭제하시겠습니까? Y / N");
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().toUpperCase().charAt(0);
		if (c == 'Y') {
			return true;
		} else if (c == 'N') {
			return false;
		}
		return false;
	}
	
	public static String getParameters() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 사원의 사원번호를 입력하세요.");
		return scanner.next();
	}
}
