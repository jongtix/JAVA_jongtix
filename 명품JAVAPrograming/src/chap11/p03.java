package chap11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class p03 extends JFrame {
	JLabel label;
	JTextField textField;
	JButton button;
	JLabel[] money = new JLabel[8];
	JTextField[] countMoney = new JTextField[8];
	String[] textMoney = { "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원" };
	
	public p03() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(new BorderLayout());
		label = new JLabel("금액");
		textField = new JTextField(10);
		button = new JButton("계산");
		button.addActionListener(new MyButtonListener(textField, countMoney));
		firstPanel.add(label, BorderLayout.WEST);
		firstPanel.add(textField, BorderLayout.CENTER);
		firstPanel.add(button, BorderLayout.EAST);
		c.add(firstPanel, BorderLayout.NORTH);
		
		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new GridLayout(8, 2));
		for (int i = 0; i < money.length; i++) {
			money[i] = new JLabel(textMoney[i]);
			countMoney[i] = new JTextField(10);
			secondPanel.add(money[i]);
			secondPanel.add(countMoney[i]);
		}
		c.add(secondPanel, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p03();
	}
	
	class MyButtonListener implements ActionListener {
		JTextField textField;
		JTextField[] countMoney = new JTextField[8];

		public MyButtonListener(JTextField textField, JTextField[] countMoney) {
			super();
			this.textField = textField;
			this.countMoney = countMoney;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			long money = Long.parseLong(textField.getText());
			long[] l = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
			int[] number = new int[8];
			
			for (int i = 0; i < l.length; i++) {
				number[i] = (int) (money / l[i]);
				money = money % l[i];
			}
			
			for (int i = 0; i < countMoney.length; i++) {
				countMoney[i].setText(Integer.toString(number[i]));
			}
		}
		
	}
}
