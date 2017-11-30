package p03.preparegui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import p02.singleton.Connections01;

public class AddressGUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame("연락처 프로그램");
		frame.setSize(400, 200);
		frame.setLocation(400, 300);
		Container c = frame.getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("주소"));
		panel.add(text2);
		panel.add(new JLabel("전화번호"));
		panel.add(text3);
		c.add(panel, BorderLayout.CENTER);
		JButton button = new JButton("입력");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = text1.getText();
				String address = text2.getText();
				String tel = text3.getText();
				String sql = "insert into address(name, address, tel) values(?, ?, ?);";

				Connection conn = null;
				PreparedStatement pstmt = null;
				try {
					conn = Connections01.getInstance().getConnection();
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, address);
					pstmt.setString(3, tel);
					int result = pstmt.executeUpdate();
					if (result > 0) {
						JOptionPane.showMessageDialog(text1, "성공", "메시지", JOptionPane.ERROR_MESSAGE);
					} else {
						System.out.println("저장실패");
					}
				} catch (SQLException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		c.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
