package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCSelect05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		System.out.print("값을 입력하세요 > ");
		int goodsid = scanner.nextInt();
		String sql = "SELECT " + " * " + "FROM" + " goods " + "WHERE" + " id = " + goodsid + ";";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase001", "user11", "user11");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// getInt("칼럼명") = getInt(칼럼순번)
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				System.out.println(id + " " + name + " " + price);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
