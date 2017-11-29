package p01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * insert / update / delete executeUpdate();
 * executeUpdate() 메소드는 반영된 행(row)의 수를 리턴함.
 * */
public class JDBCInsert01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/mydatabase001", user = "user11", password = "user11";
		String sql = "insert into goods(id, name, price, category, maker_makercd) values(";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.print("상품코드 입력 > ");
			int code = scanner.nextInt();
			sql += code;
			System.out.print("상품명 입력 >");
			String name = scanner.next();
			sql += ", \'" + name + "\'";
			System.out.print("가격 입력 > ");
			int price = scanner.nextInt();
			sql += ", " + price;
			System.out.print("카테고리 입력 > ");
			int category = scanner.nextInt();
			sql += ", " + category;
			System.out.print("maker 코드 입력 > ");
			int makercd = scanner.nextInt();
			sql += ", " + makercd + ");";
			System.out.println(sql);
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			if (result > 0) {
				System.out.println("저장이 완료되었습니다.");
			} else {
				System.out.println("저장에 실패하였습니다.");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
