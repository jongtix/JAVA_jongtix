package chap09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class NumberActionListener implements ActionListener {
	JTextField inputField;
	JButton button;

	public NumberActionListener(JTextField inputField, JButton button) {
		this.inputField = inputField;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		inputField.setText(inputField.getText() + button.getText());
	}

}
