package p03.layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 * member.txt를 읽어서 화면에 뿌리기
 * */
public class WindowLayoutExample5 {
	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("참가자 명단 입력 프로그램");
		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(300, 200);
		Container contentPane = frame.getContentPane();

		// 테이블 만들기
		String[] colNames = { "이름", "나이", "성별" };
		Object[][] data = { { "김철수", 24, '남' }, { "홍길동", 21, '여' }, { "일지매", 26, '여' } };

		JTable table = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(table);

		contentPane.add(scrollPane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
		contentPane.add(button, BorderLayout.SOUTH);
		
		ActionListener listener = new PrintActionListener(table);
		button.addActionListener(listener);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
