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

public class p04 extends JFrame {
	private int x = 0, y = 0;
	ImageIcon imgIcon = new ImageIcon("src\\chap12\\images\\apple.jpg");
	Image img = imgIcon.getImage();
	
	p04() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img, x, y, this);
	}
	
	public static void main(String[] args) {
		new p04();
	}
}
