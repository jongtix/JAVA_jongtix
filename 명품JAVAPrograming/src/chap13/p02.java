package chap13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class ThreadClass extends Thread {
	private JPanel p;

	public ThreadClass(JPanel p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.repaint();
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				return;
			}
		}
	}
}

public class p02 extends JFrame {

	public class MyPanel extends JPanel {
		public MyPanel() {

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int x, y;
			do {
				x = (int) (Math.random() * getWidth());
			} while (x > getWidth() - 50);
			do {
				y = (int) (Math.random() * getHeight());
			} while (y > getHeight() - 50);
			g.setColor(Color.MAGENTA);
			g.drawOval(x, y, 50, 50);
		}

	}

	p02() {
		setTitle("원을 0.5초 간격으로 이동");
		MyPanel p = new MyPanel();
		ThreadClass th = new ThreadClass(p);
		p.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				th.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		setContentPane(p);
		setBounds(700, 300, 500, 500);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new p02();
	}
}
