package chap10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p05 extends JFrame {
	private JLabel l;
	
	public p05() {
		setTitle("+, - 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		l = new JLabel("Love Java");
		c.add(l);
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new p05();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			Font f = l.getFont();
			int size = f.getSize();
			if (keyCode == KeyEvent.VK_ADD) {
				l.setFont(new Font("Arial", Font.PLAIN, size + 5));
			}
			if (keyCode == KeyEvent.VK_SUBTRACT) {
				if (size > 10) {
					l.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
		}
	}
}
