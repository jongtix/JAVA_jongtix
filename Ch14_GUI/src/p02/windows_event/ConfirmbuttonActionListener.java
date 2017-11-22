package p02.windows_event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 리스너 - 컴포넌트에 이벤트가 발생하는지 여부를 모니터링하는 객체
 * 		  - 이벤트 발생시 미리 정해진 명령문을 실행함
 * */
/** Consumer 타입의 FunctionInterface **/
public class ConfirmbuttonActionListener implements ActionListener {
	// 처리 대상 컴퍼넌트로 사용할 필드 선언
	JTextField text;
	JLabel label;
	
	public ConfirmbuttonActionListener(JTextField text, JLabel label) {
		this.text = text;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText(); // TextField의 값을 읽어옴.
		label.setText(label.getText() + ", " + name); // getText()로 얻은 값을 label에 저장
		text.setText("");
	}
}
