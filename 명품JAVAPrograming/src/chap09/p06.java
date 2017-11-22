package chap09;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p06 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Random Labels");
		frame.setSize(300, 300);
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(null);
		
		JLabel[] labels = new JLabel[20];
		int[][] randoms = new int[20][2];
		for (int i = 0; i < randoms.length; i++) {
			labels[i] = new JLabel(Integer.toString(i));
			labels[i].setOpaque(true);
			labels[i].setBackground(Color.BLUE);
			
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;
			randoms[i][0] = x;
			randoms[i][1] = y;
		}
		
		for (int i = 0; i < labels.length; i++) {
			labels[i].setLocation(randoms[i][0], randoms[i][1]);
			labels[i].setSize(10, 10);
			contentPane.add(labels[i]);
		}
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
