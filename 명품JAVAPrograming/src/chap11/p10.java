package chap11;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p10 extends JFrame {
	JLabel[] labels = new JLabel[10];
	int n;
	JLabel l;
	Container c;
	Date start;
	p10() {
		setTitle("Ten 레이블 클릭");
		start = new Date();
		c = getContentPane();
		c.setLayout(null);
		
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(Integer.toString(i));
			labels[i].setBounds((int) (Math.random() * 300), (int) (Math.random() * 300), 10, 10);
			labels[i].setForeground(Color.MAGENTA);
			labels[i].addMouseListener(new LabelEvent());
			c.add(labels[i]);
		}
		l = new JLabel("");
		l.setBounds(100, 0, 200,50);
		c.add(l);
		setBounds(700, 300, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new p10();
	}
	
	class LabelEvent implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel label = (JLabel) e.getSource();
			String str = label.getText();
			if (str.equals(Integer.toString(n))) {
				label.setVisible(false);
				n++;
			}
			if (n == 10) {
				System.out.println(new Date().getTime() - start.getTime());
				l.setText(Long.toString((new Date().getTime() - start.getTime())) + "초 걸렸습니다!");
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
