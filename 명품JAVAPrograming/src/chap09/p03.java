package chap09;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class p03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ten Color Buttons Frame");
		Container contentPane = frame.getContentPane();
		GridLayout layout = new GridLayout(1, 10);
		contentPane.setLayout(layout);
		contentPane.add(new JButton("0"));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		contentPane.add(new JButton("7"));
		contentPane.add(new JButton("8"));
		contentPane.add(new JButton("9"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
