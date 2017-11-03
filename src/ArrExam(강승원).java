package test;

import java.util.Scanner;
public class ArrExam {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;//학생 수 
		int [] students = new int [0];
		int[] scores = null;
		int i=0;
		Scanner scanner = new Scanner(System.in);
		
		for(i=0;i<students.length;i++)
			students[i]=0;
					
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.종료");
			System.out.println("---------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();
			if(selectNo ==1) {
			studentNum = scanner.nextInt();
			
			//배열공간만들기
			//int [] students = new int [studentNum];
			//System.out.println(students.length+"명 입니다");
			//System.out.println("배열입력확인"+students.length);
			
			
			int[] tempArray = new int[studentNum];
			int length = students.length;
		    for (int j = 0; j < length; j++) {
		        tempArray[j] = students[j];
		    }
			students=tempArray;
			System.out.println("입력받은 학생 수는 "+students.length+"명입니다.");
			
			}else if(selectNo==2) {//점수입력부
				
				System.out.println(students.length);
				for(i=0;i<students.length;i++){
					System.out.println((i+1)+"번째 입력입니다.(총 "+students.length+"회의 입력을 받겠습니다.");
					students[i]=scanner.nextInt();
				}
				
			}else if(selectNo==3) {
				System.out.println("총 "+students.length+"회를 출력하겠습니다.");
				for(i=0;i<students.length;i++){
					System.out.print((i+1)+"번째 출력입니다.");
					System.out.println(students[i]+"\t");
				}
			}else if(selectNo==4) {
				run=false;//종료
			}
		}//while문 종료
		System.out.println("종료");
	}
}
