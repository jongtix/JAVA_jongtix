package chap12;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p09 extends JFrame {
	p09() {
		setTitle("Blue Label 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel l1 = new BlueLabel();
		l1.setText("hello");
		l1.setFont(new Font("Arial", Font.PLAIN, 10));
		BlueLabel2 l2 = new BlueLabel2();
		l2.setText("Big Hello");
		l2.setBackground(Color.RED);
		l2.setFont(new Font("Arial", Font.BOLD, 50));
		c.add(l1);
		c.add(l2);
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new p09();
	}
	
	class BlueLabel extends JLabel {
		@Override
		protected void paintComponent(Graphics g) {
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			super.paintComponent(g);
		}
	}
	
	class BlueLabel2 extends JLabel {
		@Override
		public void setBackground(Color bg) {
			super.setOpaque(true);
			super.setBackground(Color.BLUE);
		}
	}
}
