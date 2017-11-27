package chap12;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class p01 extends JFrame {
	class MyPanel extends JPanel {
		private JButton shButton = new JButton("Hide/Show");
		private Image img = new ImageIcon("src\\chap12\\images\\back.jpg").getImage();
		private boolean flag = true;

		public MyPanel() {
			add(shButton);
			shButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					flag = !flag;
					MyPanel.this.repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (flag)
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		}

	}

	p01() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(new MyPanel());

		setBounds(700, 300, 500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new p01();
	}
}
