package chap11;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class p08 extends JFrame {
	JRadioButton button1, button2;
	JLabel image;
	Vector<ImageIcon> imageVec = new Vector<>();
	int n = 0;
	
	p08() {
		setTitle("Image Gallery Practice Frame");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		button1 = new JRadioButton("left");
		button2 = new JRadioButton("right");
		File[] files = new File("C:\\Users\\jong1\\OneDrive").listFiles();
		for (int i = 0; i < files.length; i++) {
			ImageIcon icon = new ImageIcon(files[i].getPath());
			imageVec.add(icon);
		}
		
		image = new JLabel(imageVec.get(n));
		image.addMouseListener(new LabelEvent());
		
		c.add(button1);
		c.add(button2);
		c.add(image);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p08();
	}
	
	class LabelEvent implements MouseListener {
		

		@Override
		public void mouseClicked(MouseEvent e) {
			if (button1.isSelected()) {
				if (n != 0) {
					--n;
				} else {
					n = imageVec.size() - 1;
				}
				image.setIcon(imageVec.get(n));
			}
			if (button2.isSelected()) {
				if (n != imageVec.size() - 1) {
					n++;
				} else {
					n = 0;
				}
				image.setIcon(imageVec.get(n));
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
