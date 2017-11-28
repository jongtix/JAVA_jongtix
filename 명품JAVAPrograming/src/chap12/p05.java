package chap12;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class p05 extends JFrame {
	
	p05() {
		setTitle("그래픽 이미지 확대 축소 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 500, 500);
		setContentPane(new MyPanel());
		setVisible(true);
		
		getContentPane().setFocusable(true);
		getContentPane().requestFocus();
	}
	
	class MyPanel extends JPanel {
		private ImageIcon imgIcon = new ImageIcon("src\\chap12\\images\\apple.jpg");
		private Image img = imgIcon.getImage();
		private int width, height;
		
		public MyPanel() {
			width = img.getWidth(this);
			height = img.getHeight(this);
			
			addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					if (e.getKeyChar() == '+') {
						width *= 1.1;
						height *= 1.1;
						repaint();
					} else if (e.getKeyChar() == '-') {
						width *= 0.9;
						height *= 0.9;
						repaint();
					}
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 10, 10, width, height, this);
		}
	}
	
	public static void main(String[] args) {
		new p05();
	}
}
