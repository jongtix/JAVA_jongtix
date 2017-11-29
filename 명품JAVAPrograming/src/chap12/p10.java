package chap12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class p10 extends JFrame {
	ImageIcon imgIcon = new ImageIcon("src\\chap12\\images/back.jpg");
	Image img = imgIcon.getImage();
	class MyPanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int width = img.getWidth(this);
			int height = img.getHeight(this);
			g.drawImage(img, 0, 0, width / 2, height / 2, 0, 0, width / 2, height / 2, this);
			g.drawImage(img, width / 2 + 10, 0, width + 10, height / 2, width / 2, 0, width, height / 2, this);
			g.drawImage(img, 0, height / 2 + 10, width / 2, height + 10, 0, height / 2, width / 2, height, this);
			g.drawImage(img, width / 2 + 10, height / 2 + 10, width + 10, height + 10, width / 2, height / 2, width, height, this);
		}
	}
	
	p10() {
		setTitle("그래픽 이미지 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setBounds(700, 300, img.getWidth(this) + 10, img.getHeight(this) + 10);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p10();
	}
}
