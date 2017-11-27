package chap12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p03 extends JFrame {
//	class MyPanel extends JPanel {
//		ImageIcon imgIcon = new ImageIcon("src\\chap12\\images\\apple.jpg");
//		Image img = imgIcon.getImage();
//		private int x = 250, y = 250, disX, disY;
//		
//		public MyPanel() {
//			JLabel l = new JLabel(imgIcon);
//			add(l);
//			l.addMouseListener(new MouseListener() {
//				
//				@Override
//				public void mouseReleased(MouseEvent e) {
//					System.out.println("b : " + x + " " + y);
//					x = e.getX();
//					y = e.getY();
//					System.out.println("f : " + x + " " + y);					
//				}
//				
//				@Override
//				public void mousePressed(MouseEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void mouseExited(MouseEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void mouseEntered(MouseEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//			});
//			l.addMouseMotionListener(new MouseMotionListener() {
//				
//				@Override
//				public void mouseMoved(MouseEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void mouseDragged(MouseEvent e) {
//					x = e.getX();
//					y = e.getY();
//					MyPanel.this.repaint();
//				}
//			});
//			setSize(200, 200);
//		}
//
//		
//		
//		@Override
//		protected void paintComponent(Graphics g) {
//			super.paintComponent(g);
//			g.drawImage(img, x, y, 200, 200, this);
//		}
//	}
	
	class MyLabel extends JLabel {
		private int x = 0, y = 0;
		ImageIcon imgIcon = new ImageIcon("src\\chap12\\images\\apple.jpg");
		Image img = imgIcon.getImage();
		
		public MyLabel() {
			setSize(500, 500);
			addMouseMotionListener(new MouseMotionListener() {
				
				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					MyLabel.this.repaint();
				}
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, x, y, this);
		}
	}
	
	p03() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(new MyLabel());
		
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p03();
	}
}
