package p03.preparegui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import p02.singleton.Connections01;

/**
 * 주소록 출력 프로그램 - DB에서 데이터를 읽어서 출력하는 프로그램
 */
public class AddressPrint {
	public static void main(String[] args) {
		JFrame frame = new JFrame("연락처 출력 프로그램");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.setLocation(700, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();

		String[] colNames = { "이름", "주소", "전화번호" };
		Object[][] data = new Object[10][3];

		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;

				try {
					conn = Connections01.getInstance().getConnection();
					String sql = "select * from address;";
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					int index = 0;
					while (rs.next()) {
						data[index][0] = rs.getString(2);
						data[index][1] = rs.getString(3);
						data[index][2] = rs.getString(4);
						index++;
					}

					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
		JTable table = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		button.addActionListener(new PrintActionListener(table));

		c.add(scrollPane, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
}
