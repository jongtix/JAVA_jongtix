package chap12;

import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import chap12.p06.MyPanel;

public class p06_2 extends JFrame {
	p06_2() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		int x1, y1, x2, y2, width, height;

		public MyPanel() {
			addComponentListener(new ComponentAdapter() {
				@Override
				public void componentResized(ComponentEvent e) {
					super.componentResized(e);
					repaint();
				}
			});
			;
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			width = getWidth();
			height = getHeight();
			x1 = (int) (width / 2);
			x2 = 0;
			y1 = 0;
			y2 = (int) (height / 2);
			for (int i = 0; i < 10; i++) {
				g.drawLine(x1, y1, x2, y2);
				y1 += (int) ((height / 2) / 10);
				x2 += (int) ((width / 2) / 10);
			}
			
			x1 = (int) (width / 2);
			x2 = width;
			y1 = 0;
			y2 = (int) (height / 2);
			for (int i = 0; i < 10; i++) {
				g.drawLine(x1, y1, x2, y2);
				y1 += (int) ((height / 2) / 10);
				x2 -= (int) ((width / 2) / 10);
			}
			
			x1 = (int) (width / 2);
			x2 = width;
			y1 = height;
			y2 = (int) (height / 2);
			for (int i = 0; i < 10; i++) {
				g.drawLine(x1, y1, x2, y2);
				y1 -= (int) ((height / 2) / 10);
				x2 -= (int) ((width / 2) / 10);
			}
			
			x1 = (int) (width / 2);
			x2 = 0;
			y1 = height;
			y2 = (int) (height / 2);
			for (int i = 0; i < 10; i++) {
				g.drawLine(x1, y1, x2, y2);
				y1 -= (int) ((height / 2) / 10);
				x2 += (int) ((width / 2) / 10);
			}
		}
	}

	public static void main(String[] args) {
		new p06_2();
	}
}
