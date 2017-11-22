package p03.layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 * member.txt를 읽어서 화면에 뿌리기
 * */
public class test2 {
	public static void main(String[] args) throws Exception {
		JFrame frame = new JFrame("참가자 명단 입력 프로그램");
		frame.setPreferredSize(new Dimension(300, 150));
		frame.setLocation(300, 200);
		Container contentPane = frame.getContentPane();

		// 테이블 만들기
		File file = new File("C:\\Users\\Administrator\\Documents\\JAVAjongtix\\Ch14_GUI\\src\\test\\member.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String[] colNames = new String[3];
		Object[][] data = new Object[10][3];
		String stringLine;
		int count = 0;
		while ((stringLine = reader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(stringLine, ":");
			String name = st.nextToken();
			colNames[0] = name;
			String userName = st.nextToken();
			data[count][0] = userName;
			String age = st.nextToken();
			colNames[1] = age;
			String userAge = st.nextToken();
			data[count][1] = userAge;
			String gender = st.nextToken();
			colNames[2] = gender;
			String userGender = st.nextToken();
			data[count][2] = userGender;
			count++;
		}
//		String[] colNames = { "이름", "나이", "성별" };
//		Object[][] data = { { "김철수", 24, '남' }, { "홍길동", 21, '여' }, { "일지매", 26, '여' } };

		JTable table = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(table);

		contentPane.add(scrollPane, BorderLayout.CENTER);
		JButton button = new JButton("출력");
		contentPane.add(button, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
