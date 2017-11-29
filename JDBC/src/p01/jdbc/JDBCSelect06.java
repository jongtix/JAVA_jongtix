package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCSelect06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		System.out.print("상품명을 입력하세요 > ");
		String goodsname = scanner.next();
		System.out.print("제조사명을 입력하세요 > ");
		String makername = scanner.next();
		String sql = "    SELECT " + "    goods.id '상품코드'," + "    goods.name '상품명'," + "    maker.name '제조사명',"
				+ "    goods.price '가격'," + "    stock.qty '재고'" + "	FROM" + "    goods," + "    maker,"
				+ "    stock" + "	WHERE" + "    goods.id = stock.goods_id"
				+ "        AND goods.maker_makercd = maker.makercd" + "        AND goods.name = '" + goodsname
				+ "       ' AND maker.name = '" + makername + "';";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase001", "user11", "user11");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// getInt("칼럼명") = getInt(칼럼순번)
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String maker_makername = rs.getString(3);
				int price = rs.getInt(4);
				int qty = rs.getInt(5);
				System.out.println(sql);
				System.out.println(id + " " + name + " " + maker_makername + " " + price + " " + qty);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
