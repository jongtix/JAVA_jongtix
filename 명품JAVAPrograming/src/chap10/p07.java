package chap10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p07 extends JFrame {
	JLabel l;
	
	public p07() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		l = new JLabel("Love Java");
		Font f = new Font("Arial", Font.PLAIN, 5);
		l.setFont(f);
		l.addMouseWheelListener(new MyMouseListener());
		
		c.add(l);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new p07();
	}
	
	class MyMouseListener implements MouseWheelListener {

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int i = e.getWheelRotation();
			if (i < 0) {
				l.setFont(new Font("Arial", Font.PLAIN, l.getFont().getSize() + 5));
			} else {
				if (l.getFont().getSize() >= 10) {
					l.setFont(new Font("Arial", Font.PLAIN, l.getFont().getSize() - 5));
				}
			}
		}
		
	}
}
