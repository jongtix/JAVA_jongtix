package chap09;

import java.awt.Container;

import javax.swing.JFrame;

public class p01 {
	p01() {
		JFrame frame = new JFrame();
		Container contenetPane = frame.getContentPane();
		frame.setTitle("Let\'s study Java");
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		p01 frame = new p01();
	}
}
