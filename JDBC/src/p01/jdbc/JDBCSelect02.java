package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelect02 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT" + 
				"        goods.id '상품코드'," + 
				"        goods.name '상품명'," + 
				"        maker.name '제조사명'," + 
				"        goods.price '가격'," + 
				"        stock.qty '재고'" + 
				"    FROM" + 
				"        goods," + 
				"        maker," + 
				"        stock" + 
				"    WHERE" + 
				"        goods.id = stock.goods_id" + 
				"            AND goods.maker_makercd = maker.makercd;";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase001", "user11", "user11");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("상품코드");
				String name = rs.getString("상품명");
				String makername = rs.getString("제조사명");
				int price = rs.getInt("가격");
				int qty = rs.getInt("재고");
				System.out.println(id + " " + name + " " + makername + " " + price + " " + qty);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
