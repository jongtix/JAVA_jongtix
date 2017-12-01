package chap13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p4_2 extends JFrame {
	static JLabel l = new JLabel("진동 레이블");
	
	p4_2() {
		setTitle("진동하는 프레임 만들기");
		setBounds(700, 300, 500, 500);
		Container c = getContentPane();
		c.setLayout(null);
		
		l.setBounds(100, 100, 300, 300);
		c.add(l);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p4_2();
		MyThread4_2 th = new MyThread4_2(l);
		th.start();
	}
}

class MyThread4_2 extends Thread {
	JLabel l;
	
	public MyThread4_2(JLabel l) {
		this.l = l;
	}

	@Override
	public void run() {
		while (true) {
			int x = (int) (Math.random() * 30) - 15;
			int y = (int) (Math.random() * 30) - 15;
			l.setLocation((int) (l.getLocation().getX()) + x, (int) (l.getLocation().getY()) + y);
			l.setLocation(100, 100);
		}
	}
}