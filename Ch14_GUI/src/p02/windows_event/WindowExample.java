package p02.windows_event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowExample {
	public static void main(String[] args) {
		/** 1 단계. 화면 구성 **/
		// 윈도우프레임 생성
		JFrame frame = new JFrame("헬로 자바 Program");
		// 윈도우 사이즈 조정
		frame.setPreferredSize(new Dimension(300, 100));
		// 윈도우 위치 지정
		frame.setLocation(400, 250);
		// 컨테이너 구하기
		Container contentPane = frame.getContentPane();
		// 컨테이너에 담을 컴포넌트 생성
		JTextField text = new JTextField(); // 문자열 입력 객체
		JButton button = new JButton("확인");
		JButton button2 = new JButton("취소");
		JLabel label = new JLabel("Hello");
		// 컴포넌트를 그룹화하는 panel 컴포넌트 생성
		JPanel panel = new JPanel();
		// 한쪽방향(가로 혹은 세로 방향)으로 나열하는 레이아웃 BoxLayout
		BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.X_AXIS);
		// 판넬에 컴포넌트 담기
		panel.add(button);
		panel.add(button2);
		
		// 컴포넌트에 담기
		contentPane.setLayout(new BorderLayout(10, 10));
		
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(panel, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
		
		// x버튼 클릭시 프로그램 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 이벤트 객체 생성
		ActionListener listener = new ConfirmbuttonActionListener(text, label);
		ActionListener listener2 = new CancleButtonActionListener(text);
		// 이벤트 객체를 컴포넌트에 붙이기
		button.addActionListener(listener);
		button2.addActionListener(listener2);
		
		/** 2 단계. 화면에 보이기**/
		// 윈도우 크기 보정
		frame.pack();
		// 화면에 띄우기
		frame.setVisible(true);
	}
}
