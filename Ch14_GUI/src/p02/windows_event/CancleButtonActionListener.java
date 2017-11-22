package p02.windows_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CancleButtonActionListener implements ActionListener {
	JTextField text;

	public CancleButtonActionListener(JTextField text) {
		this.text = text;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		text.setText("");
	}

}
