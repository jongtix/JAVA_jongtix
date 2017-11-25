package chap11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class p06 extends JFrame {
	JTextArea textArea;
	JSlider slider;

	p06() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		textArea = new JTextArea(5, 50);
		JSlider slider1 = new Slider(slider);
		textArea.addKeyListener(new TextAreaEvent(textArea, slider1));
		slider1.addChangeListener(new SliderEvent(textArea, slider1));
		c.add(textArea);
		c.add(slider1);

		setBounds(500, 200, 500, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new p06();
	}

	class TextAreaEvent implements KeyListener {
		JTextArea textArea;
		JSlider slider;

		public TextAreaEvent(JTextArea textArea, JSlider slider) {
			this.textArea = textArea;
			this.slider = slider;
		}

		@Override
		public void keyTyped(KeyEvent e) {
			String[] str = textArea.getText().split("");
			int n = str.length;
			if (n < 100)
				slider.setValue(n);
			else {
				String st = "";
				for (int i = 0; i < str.length - 1; i++) {
					st += str[i];
				}
				textArea.setText(st);
				slider.setValue(100);
			}
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	class Slider extends JSlider {
		public Slider(JSlider slider) {
			slider = new JSlider(JSlider.HORIZONTAL);
			this.setMinimum(0);
			this.setMaximum(100);
			this.setValue(0);
			this.setPaintTicks(true);
			this.setMajorTickSpacing(20);
			this.setMinorTickSpacing(5);
			this.setPaintLabels(true);
		}
	}

	class SliderEvent implements ChangeListener {
		JTextArea textArea;
		JSlider slider;

		public SliderEvent(JTextArea textArea, JSlider slider) {
			this.textArea = textArea;
			this.slider = slider;
		}

		@Override
		public void stateChanged(ChangeEvent e) {
			String[] str = textArea.getText().split("");
			int n = slider.getValue();
			if (n <= str.length) {
				String st = "";
				for (int i = 0; i < n; i++) {
					st += str[i];
				}
				textArea.setText(st);
			}
		}

	}
}
