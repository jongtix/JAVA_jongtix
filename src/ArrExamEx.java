
import java.util.Scanner;
public class ArrExamEx {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;//�л� �� 
		int [] students = new int [0];
		int[] scores = null;
		int i=0;
		Scanner scanner = new Scanner(System.in);
		
		for(i=0;i<students.length;i++)
			students[i]=0;
					
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.����");
			System.out.println("---------------------");
			System.out.print("����>");
			int selectNo = scanner.nextInt();
			if(selectNo ==1) {
			studentNum = scanner.nextInt();
			
			//�迭���������
			//int [] students = new int [studentNum];
			//System.out.println(students.length+"�� �Դϴ�");
			//System.out.println("�迭�Է�Ȯ��"+students.length);
			
			
			int[] tempArray = new int[studentNum];
			int length = students.length;
		    for (int j = 0; j < length; j++) {
		        tempArray[j] = students[j];
		    }
			students=tempArray;
			System.out.println("�Է¹��� �л� ���� "+students.length+"���Դϴ�.");
			
			}else if(selectNo==2) {//�����Էº�
				
				System.out.println(students.length);
				for(i=0;i<students.length;i++){
					System.out.println((i+1)+"��° �Է��Դϴ�.(�� "+students.length+"ȸ�� �Է��� �ްڽ��ϴ�.");
					students[i]=scanner.nextInt();
				}
				
			}else if(selectNo==3) {
				System.out.println("�� "+students.length+"ȸ�� ����ϰڽ��ϴ�.");
				for(i=0;i<students.length;i++){
					System.out.print((i+1)+"��° ����Դϴ�.");
					System.out.println(students[i]+"\t");
				}
			}else if(selectNo==4) {
				run=false;//����
			}
		}//while�� ����
		System.out.println("����");
	}
}
