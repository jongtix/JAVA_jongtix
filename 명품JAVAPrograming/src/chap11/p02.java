package chap11;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class p02 extends JFrame {
	JTextField textField;
	JComboBox<String> box;
	String text;
	
	public p02() {
		setTitle("JTextField and JCombobox");
		setLayout(new FlowLayout());
		Container c = getContentPane();
		textField = new JTextField(10);
		textField.addActionListener(new MyEventListener());
		box = new JComboBox<>();
		c.add(textField);
		c.add(box);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p02();
	}
	
	class MyEventListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			text = ((JTextField) e.getSource()).getText();
			box.addItem(text);
			textField.setText("");
		}
		
	}
}
