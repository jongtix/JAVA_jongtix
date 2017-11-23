package chap10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class p02 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("드래깅동안 YELLOW변환");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		c.setBackground(Color.GREEN);
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				Container c = (Container) e.getSource();
				c.setBackground(Color.GREEN);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				Container c = (Container) e.getSource();
				c.setBackground(Color.YELLOW);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		frame.setVisible(true);
	}
}
