package p03.layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowLayoutExample4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("연락처 프로그램");
		frame.setPreferredSize(new Dimension(250, 150));
		frame.setLocation(300, 200);
		Container contentPane = frame.getContentPane();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2)); // 레이아웃 설정
		
		JLabel nameLabel = new JLabel("이름");
		JTextField nameText = new JTextField();
		JLabel locationLabel = new JLabel("주소");
		JTextField locationText = new JTextField();
		JLabel telLabel = new JLabel("전화번호");
		JTextField telText = new JTextField();
		JLabel resultLabel = new JLabel("");
		
		// 그룹화 컴포넌트인 panel에 컴포넌트 저장
		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(locationLabel);
		panel.add(locationText);
		panel.add(telLabel);
		panel.add(telText);
		
		contentPane.add(panel, BorderLayout.CENTER);
		JButton button = new JButton("입력");
		contentPane.add(button, BorderLayout.SOUTH);
		
		ActionListener listener = new ConfirmButtonActionListener(nameText, locationText, telText);
		button.addActionListener(listener);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
}
