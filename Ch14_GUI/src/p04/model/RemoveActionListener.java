package p04.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveActionListener implements ActionListener {
	JTable table;

	public RemoveActionListener(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		if (row == -1) {
			return;
		}
		int choice = JOptionPane.showConfirmDialog(table, "삭제하시겠습니까?");
		if (choice != 0) return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.removeRow(row);
	}

}
