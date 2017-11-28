package chap12;

import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class p06 extends JFrame {
	p06() {
		setTitle("격자 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		int x, y, width, height;
		
		public MyPanel() {
			addComponentListener(new ComponentAdapter() {
				@Override
				public void componentResized(ComponentEvent e) {
					super.componentResized(e);
					repaint();
				}
			});;
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			x = 0; y = 0;
			width = getWidth();
			height = getHeight();
			System.out.println(width);
			while (x < width) {
				x += 10;
				g.drawLine(x, y, x, height);				
			}
			x = 0;
			while (y < height) {
				y+= 10;
				g.drawLine(x, y, width, y);
			}
		}
	}
	
	public static void main(String[] args) {
		new p06();
	}
}
