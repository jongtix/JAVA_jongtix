package chap13;

import javax.swing.JFrame;

public class p04 extends JFrame {
	p04() {
		setTitle("진동하는 프레임 만들기");
		setBounds(700, 300, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		p04 f = new p04();
		MyThread4 th = new MyThread4(f);
		th.start();
	}
}

class MyThread4 extends Thread {
	JFrame f;
	
	public MyThread4(JFrame f) {
		this.f = f;
	}

	@Override
	public void run() {
		while (true) {
			int x = (int) (Math.random() * 10) - 5;
			int y = (int) (Math.random() * 10) - 5;
			f.setLocation((int) (f.getLocation().getX()) + x, (int) (f.getLocation().getY()) + y);
			f.setLocation(700, 300);
		}
	}
}