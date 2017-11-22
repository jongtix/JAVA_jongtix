package p04.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddActionListener implements ActionListener {
	JTable table;
	JTextField text1, text2, text3;

	public AddActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3) {
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String[] arr = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		if (arr[0].length() + arr[1].length() + arr[2].length() < 1)
			return;
		/**
		 * Table이 가지고 있는 model에는 추가/삭제 기능이 없어서 DefaultTableModel로 바꾼 후 추가하여 모델에 저장함.
		 **/
		DefaultTableModel model = (DefaultTableModel) table.getModel(); // 테이블에 있는 데이터 저장 객체(model)을 얻어옴.
		int row = table.getSelectedRow();
		if (row == -1) {
			model.addRow(arr); // 1 차원 배열을 모델에 추가
			text1.setText("");
			text2.setText("");
			text3.setText("");
		} else {
			model.insertRow(row, arr);
			text1.setText("");
			text2.setText("");
			text3.setText("");
		}
	}

}
