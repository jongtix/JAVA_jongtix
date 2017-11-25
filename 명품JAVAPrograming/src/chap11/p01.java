package chap11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class p01 extends JFrame {
	JCheckBox box1, box2;
	private JButton button;

	public p01() {
		setTitle("CheckBox Practice");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		box1 = new JCheckBox();
		box2 = new JCheckBox();
		button = new JButton();

		box1.setText("버튼 비활성화");
		box2.setText("버튼 감추기");
		button.setText("test button");

		box1.addItemListener(new MyButtonEventListener());
		box2.addItemListener(new MyButtonEventListener());
		
		c.add(box1);
		c.add(box2);
		c.add(button);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new p01();
	}

	class MyButtonEventListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED && e.getItem() == box1) {
				button.setEnabled(false);
			} else {
				button.setEnabled(true);
			}
			if (e.getStateChange() == ItemEvent.SELECTED && e.getItem() == box2) {
				button.setVisible(false);
			} else {
				button.setVisible(true);
			}
			
//			JCheckBox box = (JCheckBox) e.getSource();
//			if (box.getClass().getName().equals("box1") && box.isSelected()) {
//				button.setEnabled(false);
//			} else {
//				button.setEnabled(true);
//			}
//			
//			if (box.getClass().getName().equals("box2") && box.isSelected()) {
//				button.setVisible(false);
//			} else {
//				button.setVisible(true);
//			}
		}

	}

}
