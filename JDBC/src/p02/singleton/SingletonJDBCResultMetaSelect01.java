package p02.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * MetaData - 실제 Data의 정보(타입, 길이 등의 정보)를 가진 데이터
 */
public class SingletonJDBCResultMetaSelect01 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmt = null;
		try {
			conn = Connections001.getInstance().getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from goods");
			rsmt = rs.getMetaData();
			for (int i = 1; i < rsmt.getColumnCount(); i++) {
				System.out.print(rsmt.getColumnName(i) + "\t");
			}
			System.out.println();
			while (rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				int cat = rs.getInt(4);
				System.out.println(no + "\t" + name + "\t" + price + "\t" + cat);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
