package chap09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class p02 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayout Practice");
		Container contentPane = frame.getContentPane();
		BorderLayout border = new BorderLayout(7, 5);
		contentPane.setLayout(border);
		contentPane.add(new JButton("North"), BorderLayout.NORTH);
		contentPane.add(new JButton("East"), BorderLayout.EAST);
		contentPane.add(new JButton("West"), BorderLayout.WEST);
		contentPane.add(new JButton("South"), BorderLayout.SOUTH);
		contentPane.add(new JButton("Center"), BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
