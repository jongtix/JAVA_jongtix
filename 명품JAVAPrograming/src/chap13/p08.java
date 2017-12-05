package chap13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p08 extends JFrame {
	p08() {
		setTitle("눈 내리는 샤갈의 마을");
		Container c = getContentPane();
		SnowBack back = new SnowBack();
		c.add(back);
		c.add(new Snow());
		setBounds(700, 100, back.img.getWidth(this), back.img.getHeight(this));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p08();
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		
	}
}

class SnowThread extends Thread {
	Snow snow;
	int y;
	
	public SnowThread(Snow snow, int y) {
		this.snow = snow;
		this.y = y;
	}

	@Override
	public void run() {
		y += 5;
		snow.repaint();
	}
}

class Snow extends JPanel {
	private int x, y;
	
	public Snow() {
		x = (int) (Math.random() * 300);
		y = 0;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillOval(x, y, 10, 10);
	}
}

class SnowBack extends JPanel {
	public ImageIcon i = new ImageIcon("src\\chap13\\images\\bg.jpg");
	public Image img = i.getImage();
	
	public SnowBack() {
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, img.getWidth(this), img.getHeight(this), this);
	}
}