package p02.callables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

import p01.connections.Connections;
/**
 * savepoint : commit과 commit 사이의 작업 단위를 소단위로 쪼갠 트랜잭션 단위
 * */
public class SavePointExample01 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement selectPs = null, updatePs = null;
		ResultSet rs = null;
		String sql = "";
		try {
			conn = Connections.getInstance().getConnections();
			conn.setAutoCommit(false);
			sql = "select id, total from savepoint where total > ?";
			selectPs = conn.prepareStatement(sql);
			selectPs.setInt(1, 100);
			rs = selectPs.executeQuery();
			sql = "update savepoint set total = ? where id = ?";
			updatePs = conn.prepareStatement(sql);
			Savepoint save1 = conn.setSavepoint(); // 첫 번째 savepoint 지정
			while (rs.next()) {
				String id = rs.getString("id");
				int oldTotal = rs.getInt("total");
				int newPrice = oldTotal * 2;
				updatePs.setInt(1, newPrice);
				updatePs.setString(2, id);
				updatePs.executeUpdate();
				System.out.println("new Total of " + id + " is " + newPrice);
				if (newPrice >= 5000) {
					System.out.println("롤백 save1");
					conn.rollback(save1);
				}
			}
			System.out.println();
			
			sql = "select id, total from savepoint where total > ?";
			selectPs = conn.prepareStatement(sql);
			selectPs.setInt(1, 100);
			rs = selectPs.executeQuery();
			sql = "update savepoint set total = ? where id = ?";
			updatePs = conn.prepareStatement(sql);
			Savepoint save2 = conn.setSavepoint();
			while (rs.next()) {
				String id = rs.getString("id");
				int oldTotal = rs.getInt("total");
				int newPrice = oldTotal * 2;
				updatePs.setInt(1, newPrice);
				updatePs.setString(2, id);
				updatePs.executeUpdate();
				System.out.println("new Total of " + id + " is " + newPrice);
				if (newPrice >= 5000) {
					System.out.println("롤백 save2");
					conn.rollback(save2);
				}
			}
			System.out.println();
			conn.commit();
			
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, total from savepoint");
			while (rs.next()) {
				String id = rs.getString("id");
				int price = rs.getInt("total");
				System.out.println("id : " + id + ", total : " + price);
			}
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null) rs.close();
				if (selectPs != null) selectPs.close();
				if (updatePs != null) updatePs.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				
			}
		}
	}
}
