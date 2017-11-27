package chap12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class p02 extends JFrame {
	class MyPanel extends JPanel {
		private Image img = new ImageIcon("src\\chap12\\images\\back.jpg").getImage();
		private int startX, startY;
		private boolean flag = false;

		public MyPanel() {
			addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {

				}

				@Override
				public void mousePressed(MouseEvent e) {
					startX = e.getX();
					startY = e.getY();
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

			addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseDragged(java.awt.event.MouseEvent e) {
					flag = true;
					MyPanel.this.repaint();
				}

				@Override
				public void mouseMoved(java.awt.event.MouseEvent e) {
					// TODO Auto-generated method stub

				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			if (flag) {
				g.setColor(Color.GREEN);
				g.fillOval(startX, startY, 20, 20);
			}
		}
	}

	p02() {
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new MyPanel());

		setBounds(700, 300, 500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new p02();
	}
}
