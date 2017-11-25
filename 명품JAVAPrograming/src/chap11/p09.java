package chap11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class p09 extends JFrame {
	JButton[] buttons = new JButton[3];
	JLabel me, com, result;

	p09() {
		setTitle("가위 바위 보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.setLayout(new FlowLayout());
		top.setBackground(Color.LIGHT_GRAY);
		buttons[0] = new JButton(new ImageIcon(
				"H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap11\\images\\gawi.jpg"));
		buttons[1] = new JButton(new ImageIcon(
				"H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap11\\images\\bawi.jpg"));
		buttons[2] = new JButton(new ImageIcon(
				"H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap11\\images\\bo.jpg"));
		// for (int i = 0; i < buttons.length; i++) {
		// buttons[i].setSize(200, 200);
		// }
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addMouseListener(new ButtonEvent());
		}
		top.add(buttons[0]);
		top.add(buttons[1]);
		top.add(buttons[2]);
		c.add(top, BorderLayout.NORTH);

		JPanel center = new JPanel();
		center.setLayout(new FlowLayout());
		center.setBackground(Color.YELLOW);
		me = new JLabel("me");
		com = new JLabel("com");
		result = new JLabel("시작");
		result.setForeground(Color.RED);
		center.add(me);
		center.add(com);
		center.add(result);
		c.add(center, BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new p09();
	}

	class ButtonEvent implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JButton button = (JButton) e.getSource();
			String str = button.getIcon().toString();
			me.setIcon(new ImageIcon(str));
			int comResult = (int) (Math.random() * 3);
			switch (comResult) {
			case 0:
				com.setIcon(new ImageIcon("H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap11\\images\\gawi.jpg"));
				break;
			case 1:
				com.setIcon(new ImageIcon("H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap11\\images\\bawi.jpg"));
				break;
			case 2:
				com.setIcon(new ImageIcon("H:\\JAVAjongtix\\명품JAVAPrograming\\src\\chap11\\images\\bo.jpg"));
				break;
			}
			
			if (str.contains("gawi")) {
				if (comResult == 0) {
					result.setText("Same !!!");
				} else if (comResult == 1) {
					result.setText("Computer !!!");
				} else {
					result.setText("Me !!!");
				}
			} else if (str.contains("bawi")) {
				if (comResult == 0) {
					result.setText("Me !!!");
				} else if (comResult == 1) {
					result.setText("Same !!!");
				} else {
					result.setText("Computer !!!");
				}
			} else if (str.contains("bo")) {
				if (comResult == 0) {
					result.setText("Computer !!!");
				} else if (comResult == 1) {
					result.setText("Me !!!");
				} else {
					result.setText("Same !!!");
				}
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
