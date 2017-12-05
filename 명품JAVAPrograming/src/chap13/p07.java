package chap13;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p07 extends JFrame {
	p07() {
		setTitle("스네이크 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GamePanel());
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p07();
	}
}

class GamePanel extends JPanel {
	Vector<JLabel> vec;
	
	public GamePanel() {
		vec = new Vector<>();
		setLayout(null);
		Head head = new Head();
		head.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_DOWN) {
					
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
		vec.add(head);
		add(head);
		for (int i = 1; i < 10; i++) {
			Body l = new Body();
			vec.add(l);
			add(l);
		}
//		vec.get(1).setLocation(30, 30);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		ImageIcon i = new ImageIcon("src\\chap13\\images\\bg.jpg");
		Image img = i.getImage();
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
}

class Head extends JLabel {
	public Head() {
		ImageIcon icon= new ImageIcon("src\\chap13\\images\\head.jpg");
		setIcon(icon);
		setBounds(10, 10, icon.getIconWidth(), icon.getIconHeight());
	}
}

class Body extends JLabel {
	public Body() {
		ImageIcon icon = new ImageIcon("src\\chap13\\images\\body.jpg");
		setIcon(icon);
		setBounds(10, 10, icon.getIconWidth(), icon.getIconHeight());
	}
}