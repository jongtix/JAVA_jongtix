package p05.graphic;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraphicExample2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("성적 그래프 프로그램");
		frame.setLocation(400, 200);
		frame.setPreferredSize(new Dimension(400, 350));
		Container contentPane = frame.getContentPane();
		DrawingPanel drawingPanel = new DrawingPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		JPanel controlPanel = new JPanel();
		JLabel label1 = new JLabel("국어");
		JTextField text1 = new JTextField(3);
		JLabel label2 = new JLabel("영어");
		JTextField text2 = new JTextField(3);
		JLabel label3 = new JLabel("수학");
		JTextField text3 = new JTextField(3);
		JButton button = new JButton("그래프 그리기");
		controlPanel.add(label1);
		controlPanel.add(text1);
		controlPanel.add(label2);
		controlPanel.add(text2);
		controlPanel.add(label3);
		controlPanel.add(text3);
		controlPanel.add(button);
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		ActionListener listener = new DrawingActionListener(drawingPanel, text1, text2, text3);
		button.addActionListener(listener);
		frame.pack();
		frame.setVisible(true);
	}
}
