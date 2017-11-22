package p03.layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * FlowLayout - 가로로 배치되어 있다가 폭이 좁아지면 컴포넌트들이 아래로 내려오는 레이아웃 구조
 * */
public class WindowLayoutExample2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("과일 바구니");
		Container contentPane = frame.getContentPane();
		
		// 레이아웃 생성
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);
		contentPane.add(new JButton("사과"));
		contentPane.add(new JButton("파인애플"));
		contentPane.add(new JButton("오렌지"));
		contentPane.add(new JButton("포도"));
		contentPane.add(new JButton("레몬"));
		contentPane.add(new JButton("복숭아"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
