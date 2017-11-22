package p04.model;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * 빈테이블에 데이터 추가 및 삭제
 * */
public class WindowExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setPreferredSize(new Dimension(500, 200));
		frame.setLocation(480, 400);
		Container contentPane = frame.getContentPane();
		
		String[] colNames = { "이름", "나이", "성별" };
		
		// 행 추가/삽입 기능 모델 객체 생성
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		
		// table에 모델 부착
		JTable table = new JTable(model);
		
		// 스크롤  가능 테이블로 변경, 컨테이너의 중앙에 배치
		contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
		
		// 컴포넌트 그룹화
		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(2);
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");
		JButton button3 = new JButton("수정");
		
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("나이"));
		panel.add(text2);
		panel.add(new JLabel("성별"));
		panel.add(text3);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		// 컨테이너에 컴포넌트그룹 부착
		contentPane.add(panel, BorderLayout.SOUTH);
		
		// 리스너
		ActionListener listener = new AddActionListener(table, text1, text2, text3);
		button1.addActionListener(listener);
		ActionListener listener2 = new RemoveActionListener(table);
		button2.addActionListener(listener2);
		ActionListener listener3 = new UpdateActionListener(table, text1, text2, text3);
		button3.addActionListener(listener3);
		
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
