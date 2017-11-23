package chap09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenges09 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Open Challenge 9");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		Container c = frame.getContentPane();
		
		NorthPanel nor = new NorthPanel();
		CenterPanel cen = new CenterPanel();
		
		c.add(nor, BorderLayout.NORTH);
		c.add(cen, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
}

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		JLabel label1 = new JLabel("Hello");
		JLabel label2 = new JLabel("Java");
		JLabel label3 = new JLabel("Love");

		label1.setBounds((int) (Math.random() * 300), (int) (Math.random() * 300), 100, 100);
		label2.setBounds((int) (Math.random() * 300), (int) (Math.random() * 300), 100, 100);
		label3.setBounds((int) (Math.random() * 300), (int) (Math.random() * 300), 100, 100);
		
		add(label1);
		add(label2);
		add(label3);
	}
}