package chap09;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p05 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("4x4 Color Frame");
		Container contentPane = frame.getContentPane();
		GridLayout layout = new GridLayout(4, 4);
		contentPane.setLayout(layout);
		JLabel[] labels = new JLabel[16];
		Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
				Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE,
				Color.BLUE, Color.MAGENTA };
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(Integer.toString(i));
			labels[i].setOpaque(true); // 투명도 설정
			labels[i].setBackground(color[i]);
			contentPane.add(labels[i]);
		}

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
