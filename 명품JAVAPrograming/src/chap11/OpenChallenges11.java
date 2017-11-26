package chap11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenges11 extends JFrame {
	JLabel l;
	JButton leftButton, rightButton;
	int n = 0;
	String[] imageFilesLocation = { "src\\chap11\\images\\image0.jpg", "src\\chap11\\images\\image1.jpg", "src\\chap11\\images\\image2.jpg", "src\\chap11\\images\\image3.jpg" };
	
	public OpenChallenges11() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		l = new JLabel(new ImageIcon(imageFilesLocation[n]));
		c.add(l, BorderLayout.CENTER);
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.setBackground(Color.LIGHT_GRAY);
		leftButton = new JButton(new ImageIcon("src\\chap11\\images\\left.png"));
		rightButton = new JButton(new ImageIcon("src\\chap11\\images\\right.png"));
		leftButton.addMouseListener(new LeftButtonEvent());
		rightButton.addMouseListener(new RightButtonEvent());
		p.add(leftButton);
		p.add(rightButton);
		c.add(p, BorderLayout.SOUTH);
		
		setBounds(700, 300, 500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new OpenChallenges11();
	}
	
	class RightButtonEvent implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
//			if (n != imageFilesLocation.length - 1) {
//				n++;
//			} else {
//				n = 0;
//			}
			n++;
			n = n % imageFilesLocation.length;
			l.setIcon(new ImageIcon(imageFilesLocation[n]));
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
	
	class LeftButtonEvent implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
//			if (n != 0) {
//				n--;
//			} else {
//				n = imageFilesLocation.length - 1;
//			}
			n--;
			n += imageFilesLocation.length;
			n %= imageFilesLocation.length;
			l.setIcon(new ImageIcon(imageFilesLocation[n]));
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
