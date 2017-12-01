package chap13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p03 extends JFrame {
	JLabel l = new JLabel();
	
	p03() {
		setTitle("디지털 시계 만들기");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		l.setFont(new Font("Arial", Font.BOLD, 80));
		c.add(l, BorderLayout.CENTER);
		
		setBounds(700, 300, 500, 500);
		setVisible(true);
		MyThread3 th = new MyThread3(l);
		th.start();
	}
	public static void main(String[] args) {
		new p03();
	}
}

class MyThread3 extends Thread {
	JLabel l = new JLabel();
	
	public MyThread3(JLabel l) {
		this.l = l;
	}

	@Override
	public void run() {
		while (true) {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR);
			int min = c.get(Calendar.MINUTE);
			int sec = c.get(Calendar.SECOND);
			
			l.setText(hour + " : " + min + " : " + sec);
		}
	}
}