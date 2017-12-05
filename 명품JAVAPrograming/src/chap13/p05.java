package chap13;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p05 extends JFrame {
	private static Chicken chicken = new Chicken();
	private int x;
	
	p05() {
		setTitle("사격 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		Game game = new Game();
		c.add(game);
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new p05();
		ChickenThread th = new ChickenThread(chicken);
		th.start();
	}
	
	class Game extends JPanel {
		Game() {
			JPanel gamePanel = new JPanel();
			gamePanel.setBackground(Color.BLACK);
			gamePanel.add(chicken);
//			gamePanel.add(new Box());
			gamePanel.setSize(500, 500);
		}
	}
	
}

class Box extends JLabel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(225, 410, 50, 50);
	}
}

class Chicken extends JLabel {
	private ImageIcon imgIcon = new ImageIcon("src\\chap13\\images/chicken.jpg");
	private Image img = imgIcon.getImage();
	private int x;
	
	public Chicken() {
		this.x = 430;
	}

	public Chicken(int x) {
		this.x = x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, x, 0, img.getWidth(this), img.getHeight(this), this);
	}
}

class ChickenThread extends Thread {
	Chicken chicken;
	int x;

	public ChickenThread(Chicken chicken) {
		this.chicken = chicken;
	}

	@Override
	public void run() {
		this.x = (int) chicken.getLocation().getX();
		while (true) {
			if (x >= 5) {
				x -= 5;
			} else {
				x = 430;
			}
			System.out.println(x);
			chicken.setX(x);
			chicken.repaint();
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}