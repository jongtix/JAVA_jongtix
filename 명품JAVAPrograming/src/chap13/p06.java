package chap13;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class p06 extends JFrame {
	p06() {
		setTitle("버블 게임");
		setLayout(null);
		Container c = getContentPane();
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
				int x = e.getX();
				int y = e.getY();
				ImageIcon imgIcon = new ImageIcon("src\\chap13\\images\\chicken.jpg");
				JLabel bubble = new JLabel(imgIcon);
				bubble.setBounds(x, y, imgIcon.getIconWidth(), imgIcon.getIconHeight());
				BubbleThread th = new BubbleThread(bubble, x, y);
				c.add(bubble);
				th.start();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p06();
	}
}

class BubbleThread extends Thread {
	JLabel bubble;
	int x, y;
	
	public BubbleThread(JLabel bubble, int x, int y) {
		this.bubble = bubble;
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		while (true) {
			bubble.setLocation(x, y);
			try {
				sleep(20);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			y -= 5;
			if (y <= -50) {
				bubble.setVisible(false);
				return;
			}			
		}
	}
}