package p01.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;

/**
 * JDBC를 이용한 DB작업
 * 1. DRIVER로딩
 * 2. CONNECTION
 * 3. 작업
 * 4. 자원해제
 * */
public class SelectExample03 {
	public static void main(String[] args) {
		// emp테이블의 사번, 사원명, 급여, 입사일자, 부서명
		// 부서번호가 10번인 부서의 사원들
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		
		PreparedStatement pstmt = null;
		String sql = "select e.empno, e.ename, e.sal, e.hiredate, d.dname from emp e, dept d where e.deptno = d.deptno and e.deptno = ? and sal >= ?";
		// sql문에서 ';'이 없어야 실행됨
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
			Scanner scanner = new Scanner(System.in);
			System.out.println("부서번호를 입력하세요.");
			pstmt.setInt(1, scanner.nextInt());
			System.out.println("급여를 입력하세요.");
			pstmt.setInt(2, scanner.nextInt());
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				double sal = rs.getDouble(3);
				Date hiredate = rs.getDate(4);
				String dname = rs.getString(5);
				System.out.println(no + " : " + name + " : " + sal + " : " + hiredate + " : " + dname);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
