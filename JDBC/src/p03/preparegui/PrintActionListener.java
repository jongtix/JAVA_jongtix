package p03.preparegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PrintActionListener implements ActionListener {
	JTable table;

	public PrintActionListener(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TableModel model = table.getModel();
		int rowNum = model.getRowCount();
		int rowCount = model.getColumnCount();
		int selectedRowNum = table.getSelectedRow();
		if (selectedRowNum != -1) {
			System.out.println((String) table.getValueAt(selectedRowNum, 0));
			
			String name = (String) table.getValueAt(selectedRowNum, 0);
			String address = (String) table.getValueAt(selectedRowNum, 1);
			String tel = (String) table.getValueAt(selectedRowNum, 2);
			System.out.println(name + " " + address + " " + tel);
		}
	}

}
