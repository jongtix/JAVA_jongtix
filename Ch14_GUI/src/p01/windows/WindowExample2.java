package p01.windows;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("내가 만든 첫 번째 윈도우 프로그램");
		frame.setSize(400, 300);
		frame.setLocation(300, 200);
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("반갑습니다. GUI", SwingConstants.CENTER);
		contentPane.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
