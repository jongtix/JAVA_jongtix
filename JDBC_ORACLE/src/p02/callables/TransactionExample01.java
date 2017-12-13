package p02.callables;

import java.sql.Connection;
import java.sql.PreparedStatement;

import p01.connections.Connections;

/**
 * autocommit옵션을 false로 하여 자동 저장하지 않도록 하여
 * 입력/수정 처리가 모두 정상으로 끝나면 commit하도록 변환
 * 입력/수정 처리가 하나라도 이상이 있으면 rollback; 
 * */
public class TransactionExample01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		boolean success = false;
		try {
			conn = Connections.getInstance().getConnections();
			String sql = "create table test0001(id varchar2(10), password varchar2(10))";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			
			
			conn.setAutoCommit(success); // 자동저장 기능 끄기
			
			
			sql = "insert into test0001 values('sh1011', '1111')";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			sql = "insert into test0001 values('sh2011', '2222')";
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			sql = "insert into test0001 values('sh2033', '3333')"; // 의도적으로 비정상 쿼리문 생성
																   // 자동저장을 끄기 전까지만 쿼리 작업 수행
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			success = true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (success) {
					conn.commit();
				} else {
					conn.rollback();
				}
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
