package chap12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpenChallenges12 extends JFrame {
	ImageIcon imgIcon = new ImageIcon("src\\chap12\\images/bg.jpg");
	Image img = imgIcon.getImage();
	int x, y, width, height;
	MyImage myImage = new MyImage();
	JTextField text = new JTextField(5);
	Container c = getContentPane();
	static boolean flag = true;

	class MyImage extends JPanel {

		public MyImage() {
			addKeyListener(new MoveAction());
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (flag) g.setClip(x, y, 50, 50);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			width = getWidth() - 50;
			height = getHeight() - 50;
		}

	}

	class MoveAction implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_LEFT) {
				if (x > 0)
					x -= 10;
			} else if (keyCode == KeyEvent.VK_RIGHT) {
				if (x < width)
					x += 10;
			} else if (keyCode == KeyEvent.VK_UP) {
				if (y > 0)
					y -= 10;
			} else if (keyCode == KeyEvent.VK_DOWN) {
				if (y < height)
					y += 10;
			}
			myImage.repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class Answer extends JPanel {
		public Answer() {
			setBackground(Color.GRAY);
			setLayout(new FlowLayout());
			add(new JLabel("정답"));
			add(text);
			text.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (text.getText().equals("25")) {
						flag = false;
						myImage.repaint();
					} else {
						System.out.println("오답;");
					}
				}
			});
		}

	}

	public OpenChallenges12() {
			setTitle("Open Challenge 12");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c.setLayout(new BorderLayout());
			c.add(myImage, BorderLayout.CENTER);
			c.addKeyListener(new MoveAction());
			c.add(new Answer(), BorderLayout.SOUTH);
			setBounds(600, 200, img.getWidth(this), img.getHeight(this) + 10);
			c.setFocusable(true);
			c.requestFocus();
			setVisible(true);
		
	}

	public static void main(String[] args) {
		new OpenChallenges12();
	}
}
