package chap09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class p07 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("계산기 프레임");
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout(10, 10));
		
		JPanel panelNorth = new JPanel();
		JLabel input = new JLabel("수식입력");
		JTextField inputField = new JTextField(10);
		panelNorth.add(input);
		panelNorth.add(inputField);
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JButton[] buttons = new JButton[16]; 
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton(Integer.toString(i));
		}
		buttons[10] = new JButton("CE");
		buttons[11] = new JButton("계산");
		buttons[12] = new JButton("+");
		buttons[13] = new JButton("-");
		buttons[14] = new JButton("x");
		buttons[15] = new JButton("/");
		
		JPanel panelCenter = new JPanel();
		GridLayout grid = new GridLayout(4, 4);
		panelCenter.setLayout(grid);
		for (int i = 0; i < buttons.length; i++) {
			if (i >= 12) {
				buttons[i].setBackground(Color.BLUE);
			}
			panelCenter.add(buttons[i]);
		}
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		JPanel panelSouth = new JPanel();
		JLabel output = new JLabel("계산 결과");
		JTextField outputField = new JTextField(10);
		panelNorth.add(output);
		panelNorth.add(outputField);
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	int inputNumber(JButton number) {
		int n = Integer.parseInt(number.getText());
		return n;
	}
}
