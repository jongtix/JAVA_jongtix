package chap09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class p08 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("여러 개의 패널을 가진 프레임");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		Container c = frame.getContentPane();
		
		JPanel NorthPanel = new JPanel();
		JButton openB = new JButton("열기");
		JButton closeB = new JButton("닫기");
		JButton exitB = new JButton("나가기");
		NorthPanel.add(openB);
		NorthPanel.add(closeB);
		NorthPanel.add(exitB);
		NorthPanel.setBackground(Color.GRAY);
		c.add(NorthPanel, BorderLayout.NORTH);
		
		JPanel CenterPanel = new JPanel();
		CenterPanel.setLayout(null);
		CenterPanel.setBackground(Color.WHITE);
		JLabel[] labels = new JLabel[10];
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("*");
			int x = (int) (Math.random() * 300) + 100;
			int y = (int) (Math.random() * 300) + 100;
			labels[i].setForeground(Color.RED);
			labels[i].setBounds(x, y, 10, 10);
			CenterPanel.add(labels[i]);
		}
		c.add(CenterPanel, BorderLayout.CENTER);
		
		JPanel SouthPanel = new JPanel();
		SouthPanel.setBackground(Color.YELLOW);
		JButton inputB = new JButton("Word Input");
		JTextField inputT = new JTextField(20);
		SouthPanel.add(inputB);
		SouthPanel.add(inputT);
		c.add(SouthPanel, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}
