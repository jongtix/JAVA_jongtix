package chap10;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("마우스 올리기 내리기");
		Container c = frame.getContentPane();
		JLabel l = new JLabel();
		l.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel l = (JLabel) e.getSource();
				l.setText("사랑해");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel l = (JLabel) e.getSource();
				l.setText("Love Java");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		c.add(l);
		frame.setVisible(true);
	}
}
