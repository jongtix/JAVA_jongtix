package chap12;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class p04 extends JFrame {
	
	p04() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private int x, y, width, height;
		private ImageIcon imgIcon = new ImageIcon("src\\chap12\\images\\apple.jpg");;
		private Image img = imgIcon.getImage();
		
		
		public MyPanel() {
			x = 0;
			y = 0;
			width = img.getWidth(this);
			height = img.getHeight(this);
			
			addMouseMotionListener(new MouseMotionListener() {
				
				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
		
		public void paintComponents(Graphics g) {
			super.paintComponents(g);
			g.drawImage(img, x, y, width, height, this);
		}
	}
	
	
	public static void main(String[] args) {
		new p04();
	}
}
