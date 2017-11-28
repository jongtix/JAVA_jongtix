package chap12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class p08 extends JFrame {
	Vector<MyCircle> vec = new Vector<>();
	
	
	p08() {
		setTitle("마우스로 원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
//				System.out.println(vec.size());
//				for (int i = 0; i < vec.size(); i++) {
//					setContentPane(vec.get(i));
//				}
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				vec.add(new MyCircle());
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
				// TODO Auto-generated method stub
				
			}
		});
		
		setBounds(700, 300, 500, 500);
		setVisible(true);
	}
	
	class MyCircle extends JPanel {
		int x1, y1, x2, y2, width, height, r;
		
		public MyCircle() {
			
			addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					x2 = e.getX();
					y2 = e.getY();
					repaint();
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					x1 = e.getX();
					y1 = e.getY();
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
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			width = Math.abs(x1 - x2);
			height = Math.abs(y1 - y2);
			r = (int) (Math.sqrt(width*width + height*height));
			g.setColor(Color.BLUE);
			g.drawOval(x1 - r, y1 - r, r * 2, r * 2);
			for (int i = 0; i < vec.size(); i++) {
				vec.get(i);				
			}
		}
	}
	
	public static void main(String[] args) {
		new p08();
	}
}
