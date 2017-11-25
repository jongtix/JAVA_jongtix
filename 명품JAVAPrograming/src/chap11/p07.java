package chap11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class p07 extends JFrame {
	JSlider slider;
	JLabel label;
	
	p07() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		label = new JLabel("I Love Java");
		slider = new Slider();
		
		slider.addChangeListener(new SliderEvent(slider, label));
		
		c.add(slider);
		c.add(label);
		
		setBounds(500, 300, 500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p07();
	}
	
//	class Label extends JLabel {
//		public Label() {
//			label = new JLabel("I Love Java");
//		}
//	}
	
	class Slider extends JSlider {
		public Slider() {
			slider = new JSlider(JSlider.HORIZONTAL);
			this.setMinimum(1);
			this.setMaximum(100);
			this.setValue(label.getFont().getSize());
			this.setPaintTicks(true);
			this.setMajorTickSpacing(20);
			this.setMinorTickSpacing(5);
			this.setPaintLabels(true);
		}
	}
	
	class SliderEvent implements ChangeListener {
		JSlider slider;
		JLabel label;

		public SliderEvent(JSlider slider, JLabel label) {
			this.slider = slider;
			this.label = label;
		}

		@Override
		public void stateChanged(ChangeEvent e) {
			label.setFont(new Font("Arial", Font.PLAIN, slider.getValue()));
		}
		
	}
}
