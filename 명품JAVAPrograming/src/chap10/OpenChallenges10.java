package chap10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class OpenChallenges10 extends JFrame {
	JLabel[] l;
	JLabel label;
	
	public OpenChallenges10() {
		setTitle("Open Challenges 10");
		setSize(350, 350);
		Container c = getContentPane();
//		c.setLayout(new BorderLayout());
		c.addKeyListener(new MyEvent());
		JPanel p = new GamePanel();
		c.add(p);
		
//		l = new JLabel[3];
//		
//		JPanel cen = new JPanel();
//		for (int i = 0; i < l.length; i++) {
//			l[i] = new JLabel("0");
//			l[i].setBackground(Color.BLUE);
//			cen.add(l[i]);
//		}
//		label = new JLabel("시작합니다.");
//		c.add(cen, BorderLayout.CENTER);
//		c.add(label, BorderLayout.SOUTH);
		
		c.setFocusable(true);
		c.requestFocus();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new OpenChallenges10();
	}
	
	class MyEvent extends KeyAdapter {
	    public void keyPressed(KeyEvent e) {
	    	int keyCode = e.getKeyCode();
	    	if (keyCode == KeyEvent.VK_ENTER) {
	    		for (int i = 0; i < l.length; i++) {
	    			l[i].setText(Integer.toString((int) (Math.random() * 5)));
	    		}
	    		if (check()) {
	    			label.setText("축하합니다!!");
	    		} else {
	    			label.setText("아쉽군요");
	    		}
	    	}
	    }
	    
	    boolean check() {
	    	String f = l[0].getText();
	    	String s = l[1].getText();
	    	String t = l[2].getText();
	    	if (f.equals(s) && s.equals(t)) {
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }
	}
	
	class GamePanel extends JPanel {
		public GamePanel() {
			setLayout(null);
			l = new JLabel[3];
			for (int i = 0; i < 3; i++) {
				l[i] = new JLabel("0", SwingConstants.CENTER);
				l[i].setOpaque(true);
				l[i].setBackground(Color.BLUE);
			}
			l[0].setBounds(50, 50, 50, 50);
			l[1].setBounds(150, 50, 50, 50);
			l[2].setBounds(250, 50, 50, 50);
			label = new JLabel("시작합니다.");
			label.setBounds(140, 150, 100, 50);
			
			add(l[0]);
			add(l[1]);
			add(l[2]);
			add(label);
		}
	}
}
