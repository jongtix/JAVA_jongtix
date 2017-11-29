package chap12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class p11 extends JFrame {
	JLabel[] l = new JLabel[4];
	JTextField[] t = new JTextField[4];
	int[] qty = new int[4];
	double[] avg = new double[4];
	String[] str = { "apple", "cherry", "strawberry", "prune" };
	int startAngle = 0, arcAngle = 0;
	MyCirclePanel lc = new MyCirclePanel();
	Color[] color = { Color.RED, Color.BLUE, Color.CYAN, Color.YELLOW };
	
	class MyCirclePanel extends JPanel {
		public MyCirclePanel() {
			setLayout(null);
			setSize(100, 100);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i < avg.length; i++) {
				g.setColor(color[i]);
				arcAngle = (int) (360 * avg[i]);
				g.fillArc(100, 100, 200, 200, startAngle, arcAngle);
				startAngle = arcAngle;
			}
		}
		
	}

	class MyPanel extends JPanel {
		public MyPanel() {
			setLayout(new FlowLayout());
			for (int i = 0; i < l.length; i++) {
				l[i] = new JLabel(str[i]);
				t[i] = new JTextField(10);
				t[i].addActionListener(new ActionEvent());
				add(l[i]);
				add(t[i]);
			}

		}

		class ActionEvent implements ActionListener {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				JTextField text = (JTextField) e.getSource();
				for (int i = 0; i < t.length; i++) {
					qty[i] = Integer.parseInt(t[i].getText());
				}
				int sum = 0;
				for (int i = 0; i < qty.length; i++) {
					sum += qty[i];
				}
				for (int i = 0; i < qty.length; i++) {
					avg[i] = (double) qty[i] / (double) sum;
				}
				drawChart();
			}

		}
	}

	p11() {
		setTitle("파이 차트 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Container c = getContentPane();
		MyPanel l = new MyPanel();
		c.add(l, BorderLayout.NORTH);
		c.add(lc, BorderLayout.CENTER);
		pack();
		setVisible(true);
	}
	
	void drawChart() {
		lc.repaint();
	}

	public static void main(String[] args) {
		new p11();
	}
}
