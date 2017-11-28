package chap12;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class p07 extends JFrame {
	p07() {
		setTitle("마우스로 패다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyLabel());
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}
	
	class MyLabel extends JLabel {
		private Vector<Integer> vecX = new Vector<>();
		private Vector<Integer> vecY = new Vector<>();
		public MyLabel() {
			
			addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					vecX.add(e.getX());
					vecY.add(e.getY());
					repaint();
				}
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			int [] x = new int[vecX.size()];
			int [] y = new int[vecY.size()];
			for (int i = 0; i < vecX.size(); i++) {
				x[i] = vecX.get(i);
				y[i] = vecY.get(i);
			}
			g.drawPolygon(x, y, x.length);
		}
	}
	
	public static void main(String[] args) {
		new p07();
	}
}
