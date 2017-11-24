package chap10;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p06 extends JFrame {
	JLabel l;
	
	public p06() {
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		l = new JLabel("c");
		l.setName("1");
		l.setBounds(100, 100, 10, 10);
		l.addMouseListener(new MyEventListener());
		c.add(l);
		
		setSize(300, 150);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new p06();
	}
	
	class MyEventListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel label = (JLabel) e.getSource();
			if (label.getName().equals("1")) {
				l.setLocation((int) (Math.random() * getSize().getWidth()), (int) (Math.random() * getSize().getHeight()));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
	    
	}
}
