package chap09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class p07 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("계산기 프레임");
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		frame.setPreferredSize(new Dimension(300, 300));
		
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
		GridLayout grid = new GridLayout(4, 4, 5, 5);
		panelCenter.setLayout(grid);
		panelCenter.setSize(new Dimension(30, 30));
		for (int i = 0; i < buttons.length; i++) {
			if (i >= 12) {
				buttons[i].setBackground(Color.BLUE);
			}
			panelCenter.add(buttons[i]);
		}
		for (int i = 0; i < buttons.length; i++) {
			if (i == 10) {
				ActionListener listener = new CEActionListener(inputField);
				buttons[i].addActionListener(listener);
			} else if (i == 11) {
				ActionListener listener = new CalculateActionListener(inputField, buttons[i]);
				buttons[i].addActionListener(listener);
			} else {
				ActionListener listener = new NumberActionListener(inputField, buttons[i]);
				buttons[i].addActionListener(listener);
			}
		}
		contentPane.add(panelCenter, BorderLayout.CENTER);
		
		JPanel panelSouth = new JPanel();
		JLabel output = new JLabel("계산 결과");
		JTextField outputField = new JTextField(10);
		panelSouth.add(output);
		panelSouth.add(outputField);
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	int inputNumber(JButton number) {
		int n = Integer.parseInt(number.getText());
		return n;
	}
}

class CalculateActionListener implements ActionListener {
	JTextField inputField;
	JTextField outputField;
	JButton button;
	
	public CalculateActionListener(JTextField inputField, JButton button) {
		this.inputField = inputField;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = inputField.getText();
		String[] strings = str.split("");
		int n = strings.length;
		System.out.println(n);
		String temp = "";
		int f = 0, s = 0;
		String op = "";
		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equals("+") || strings[i].equals("-") || strings[i].equals("x") || strings[i].equals("/")) {
				for (int j = 0; j < i; j++) {
					temp += strings[j];
					f = Integer.parseInt(temp);
				}
			}
		}
//		while (st.nextToken() != null) {
//			f = Integer.parseInt(st.nextToken());
//			op = st.nextToken();
//			s = Integer.parseInt(st.nextToken());
//		}
//		double result = 0;
//		switch (op) {
//		case "+":
//			result = f + s;
//			break;
//		case "-":
//			result = f - s;
//			break;
//		case "x":
//			result = f * s;
//			break;
//		case "/":
//			result = (double) f / (double) s;
//			break;
//		}
//		outputField.setText(Double.toString(result));
	}
	
}

class CEActionListener implements ActionListener {
	JTextField inputField;

	public CEActionListener(JTextField inputField) {
		this.inputField = inputField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		inputField.setText("");
	}
	
}