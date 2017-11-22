package p01.windows;
/**
 * GUI프로그램
 * 		- Frame위에 Container를 얹고, 필요한 컴포넌트들을 담아서 만듦.
 * */

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WndowExample {
	public static void main(String[] args) {
		/** 1 단계. 윈도우 프로그램 만들기 **/
		// 윈도우 프레임 생성
		JFrame frame = new JFrame("헬로자바 프로그램");
		// 프레임 크기 조정
		frame.setPreferredSize(new Dimension(300, 200));
		// 프레임 위치 조정
		frame.setLocation(900, 100);
		// 컴포넌트들을 담을 컨테이너 생성
		Container contentPane = frame.getContentPane();
		// 문자를 출력할 라벨 컴포넌트 생성
		JLabel lable = new JLabel("Hello, Java :)", SwingConstants.CENTER);
		// 생성한 라벨컴포넌트를 컨테이너에 담기
		contentPane.add(lable);
		// 윈도우 우측 상단의 x버튼 클릭 시 프로그램 종료하도록 이벤트 추가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/** 2 단계. 화면에 디스플레이 **/
		// 화면에 나타나는 모양 보정
		frame.pack();
		// 화면에 나타내기
		frame.setVisible(true);
	}
}
