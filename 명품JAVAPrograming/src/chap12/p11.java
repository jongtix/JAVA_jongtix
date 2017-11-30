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
	JLabel[] resultL = new JLabel[4];
	JLabel[] l = new JLabel[4];
	JTextField[] t = new JTextField[4];
	double[] qty = new double[4];
	double[] avg = new double[4];
	String[] str = { "apple", "cherry", "strawberry", "prune" };
	int startAngle = 0, arcAngle = 0;
	MyCirclePanel lc = new MyCirclePanel();
	Color[] color = { Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE };
	
	class MyCirclePanel extends JPanel {
		public MyCirclePanel() {
			setLayout(null);
			setSize(200, 200);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i < resultL.length; i++) {
				g.setColor(color[i]);
				g.drawString(str[i] + " " + (int) (Math.round(avg[i] * 100)) + "%", 80 + 150 * i, 50);
			}
			for (int i = 0; i < avg.length; i++) {
				g.setColor(color[i]);
				startAngle += arcAngle;
				arcAngle = (int) Math.round(360 * avg[i]);
				System.out.println("avg[i] : " + avg[i] + ", sa : " + startAngle + ", aa : " + arcAngle);
				g.fillArc(200, 100, 200, 200, startAngle, arcAngle);
			}
			startAngle = 0;
			arcAngle = 0;
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
					qty[i] = Double.parseDouble(t[i].getText());
				}
				double sum = 0.0;
				for (int i = 0; i < qty.length; i++) {
					sum += qty[i];
				}
				for (int i = 0; i < qty.length; i++) {
//					avg[i] = (double) Math.round(((double) qty[i] / (double) sum * 100 ) / 100);
					avg[i] = qty[i] / sum;
				}
				drawChart();
			}

		}
	}

	p11() {
		for (int i = 0; i < resultL.length; i++) {
			resultL[i] = new JLabel("");
		}
		setTitle("파이 차트 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Container c = getContentPane();
		MyPanel l = new MyPanel();
		c.add(l, BorderLayout.NORTH);
		c.add(lc, BorderLayout.CENTER);
		setBounds(700, 300, 700, 700);
		setVisible(true);
	}
	
	void drawChart() {
		lc.repaint();
	}

	public static void main(String[] args) {
		new p11();
	}
}
