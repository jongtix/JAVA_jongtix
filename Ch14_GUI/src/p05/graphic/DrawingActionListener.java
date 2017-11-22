package p05.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DrawingActionListener implements ActionListener {
	DrawingPanel panel;
	JTextField text1, text2, text3;
	
	public DrawingActionListener(DrawingPanel panel, JTextField text1, JTextField text2, JTextField text3) {
		this.panel = panel;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int korean = Integer.parseInt(text1.getText());
			int english = Integer.parseInt(text2.getText());
			int math = Integer.parseInt(text3.getText());
			panel.setScores(korean, english, math);
			panel.repaint(); // 호출시마다 paint() 메소드를 호출하여 그림을 다시 그리는 메소드
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(panel, "잘못된 숫자 포멧입니다.", "에러 메시지", JOptionPane.ERROR_MESSAGE);
		}
	}

}
