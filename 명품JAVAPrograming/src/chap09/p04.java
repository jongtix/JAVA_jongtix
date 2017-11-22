package chap09;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class p04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ten Color Buttons Frame");
		Container contentPane = frame.getContentPane();
		GridLayout layout = new GridLayout(1, 10);
		contentPane.setLayout(layout);
		contentPane.add(new JButton("0")).setBackground(Color.RED);;
		contentPane.add(new JButton("1")).setBackground(Color.ORANGE);
		contentPane.add(new JButton("2")).setBackground(Color.YELLOW);
		contentPane.add(new JButton("3")).setBackground(Color.GREEN);
		contentPane.add(new JButton("4")).setBackground(Color.CYAN);
		contentPane.add(new JButton("5")).setBackground(Color.BLUE);
		contentPane.add(new JButton("6")).setBackground(Color.MAGENTA);
		contentPane.add(new JButton("7")).setBackground(Color.GRAY);
		contentPane.add(new JButton("8")).setBackground(Color.PINK);
		contentPane.add(new JButton("9")).setBackground(Color.LIGHT_GRAY);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
