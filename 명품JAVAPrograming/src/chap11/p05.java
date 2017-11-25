package chap11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class p05 extends JFrame {
	JSlider slider;
	JLabel label;
	
	public p05() {
		setTitle("Slider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		slider = new JSlider(JSlider.HORIZONTAL, 100, 200, 150);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(20);
		slider.setPaintLabels(true);
//		slider.setPaintTrack(true);
		
		label = new JLabel(Integer.toString(slider.getValue()));
		
		slider.addChangeListener(new MyEvent(slider, label));
		c.add(slider);
		c.add(label);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new p05();
	}
	
	class MyEvent implements ChangeListener {
		JSlider slider;
		JLabel label;

		public MyEvent(JSlider slider, JLabel label) {
			this.slider = slider;
			this.label = label;
		}

		@Override
		public void stateChanged(ChangeEvent e) {
			label.setText(Integer.toString(slider.getValue()));
		}
		
	}
}
