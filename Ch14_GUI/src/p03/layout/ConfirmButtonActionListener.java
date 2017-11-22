package p03.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JTextField;

public class ConfirmButtonActionListener implements ActionListener {
	JTextField nameText;
	JTextField locationText;
	JTextField telText;

	public ConfirmButtonActionListener(JTextField nameText, JTextField locationText, JTextField telText) {
		this.nameText = nameText;
		this.locationText = locationText;
		this.telText = telText;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 파일에 10개의 주소록 저장 (member.txt)
		File file = new File("C:\\Users\\Administrator\\Documents\\JAVAjongtix\\Ch14_GUI\\src\\test\\member.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
		}
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(
					"이름 : " + nameText.getText() + " 주소 : " + locationText.getText() + " 전화번호 : " + telText.getText());
			writer.flush();
			writer.close();
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		}

		// System.out.println(nameText.getText() + " : " + locationText.getText() + " :
		// " + telText.getText());
	}

}
