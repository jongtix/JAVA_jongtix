package p03.layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GridLayout - 테이블표 형식의 레이아웃
 * */
public class WindowLayoutExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("동물원");
		frame.setLocation(400, 300);
		Container contentPane = frame.getContentPane();
		
		// 레이아웃 컴포넌트 생성
		GridLayout layout = new GridLayout(3, 2);
		
		// 컨테이너의 레이아웃 설정
		contentPane.setLayout(layout); // GridLayout이 설정
		
		// 컴포넌트 추가
		contentPane.add(new JButton("얼룩말"));
		contentPane.add(new JButton("사자"));
		contentPane.add(new JButton("코끼리"));
		contentPane.add(new JButton("코뿔소"));
		contentPane.add(new JButton("펭귄"));
		contentPane.add(new JButton("하이에나"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
