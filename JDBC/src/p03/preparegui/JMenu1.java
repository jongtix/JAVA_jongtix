package p03.preparegui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

public class JMenu1 extends JFrame implements ActionListener {
	JTextField textField;

	public JMenu1() throws HeadlessException {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JMenuBar jmb = new JMenuBar();
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		
		JMenuItem jmi = new JMenuItem("주소록 입력");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi = new JMenuItem("주소록 출력");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi = new JMenuItem("불러오기");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmb.add(menu1);
		
		jmi = new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		JCheckBoxMenuItem jcbmi = new JCheckBoxMenuItem("눈금자");
		jcbmi.addActionListener(this);
		menu2.add(jcbmi);
		
		JRadioButtonMenuItem jrbmi = new JRadioButtonMenuItem("수정");
		jrbmi.addActionListener(this);
		menu2.add(jrbmi);
		
		jmb.add(menu2);
		setJMenuBar(jmb);
		
		textField = new JTextField(5);
		c.add(textField, BorderLayout.SOUTH);
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JMenu1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("주소록 입력")) {
			AddressGUI gui = new AddressGUI();
			gui.main(null);
		} else if (e.getActionCommand().equals("주소록 출력")) {
			AddressPrint print = new AddressPrint();
			print.main(null);
		}
	}

}
