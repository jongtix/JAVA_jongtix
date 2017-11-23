package chap10;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Left 키로 문자열 교체");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		JLabel l = new JLabel("Love Java");
		l.grabFocus();
		l.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				int cnt = 0;
				if (keyCode == KeyEvent.VK_LEFT) {
					JLabel l = (JLabel) e.getSource();
					if (cnt == 1) {
						l.setText("Love Java");
						cnt = 0;
					} else {
						l.setText("avaJ evoL");
						cnt++;
					}
				}
			}
		});
		
		c.add(l);
		frame.setVisible(true);
	}
}
