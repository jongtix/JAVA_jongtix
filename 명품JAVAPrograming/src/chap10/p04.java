package chap10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p04 extends JFrame {
	private JLabel l;
	
	public p04() {
		setTitle("Left 키로 문자열 이동");
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
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_LEFT) {
				String first = l.getText().substring(0, 1);
				String last = l.getText().substring(1);
				l.setText(last + first);
//				String[] str = l.getText().split("");
//				String temp = str[0];
//				for (int i = 0; i < str.length - 1; i++) {
//					str[i] = str[i + 1];
//				}
//				str[str.length - 1] = temp;
//				String st = "";
//				for (int i = 0; i < str.length; i++) {
//					st += str[i];
//				}
//				l.setText(st);
			}
		}
	}
	
	public static void main(String[] args) {
		new p04();
	}
}
