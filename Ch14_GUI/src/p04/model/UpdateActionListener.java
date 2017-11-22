package p04.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UpdateActionListener implements ActionListener {
	JTable table;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	
	public UpdateActionListener(JTable table, JTextField text1, JTextField text2, JTextField text3) {
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		if (row == -1) return;
		
		String[] arr = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		입력한 값이 없으면 수정하지 않기
//		model.getDataVector().get(row);
		if (!arr[0].equals(null)) {
			model.setValueAt(arr[0], row, 0);
		}
		if (!arr[1].equals(null)) {
			model.setValueAt(arr[1], row, 1);
		}
		if (!arr[2].equals(null)) {
			model.setValueAt(arr[2], row, 2);
		}
		text1.setText("");
		text2.setText("");
		text3.setText("");
	}

}
