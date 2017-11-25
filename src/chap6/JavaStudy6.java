package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStudy6 {
	public static void main(String[] args) {
		Circle abc = new Circle(7.0);
		double area = abc.getArea();
		double radius = abc.getRadius();
		System.out.println("반지름이 " + radius + "일 때, 원의 넓이는 " + area + "입니다.");
		
		Scanner s = new Scanner(System.in);
		ArrayList<String> studentName = new ArrayList<>();
		String name = s.next();
		studentName.add(name);
		System.out.println(name);
		System.out.println(studentName);
		if(!s.hasNext()) {
			s = new Scanner(System.in);
			name = s.next();
			studentName.add(name);
			System.out.println(studentName.get(1));
		}
		
		
//		Student student1 = new Student("이준기", 3.7);
//		Student student2 = new Student("수지", 4.1);
//		
//		String name1 = student1.getName();
//		double gpa1 = student1.getGpa();
//		System.out.println("학생 " + name1 + "의 평점은 " + gpa1 + "입니다.");
//		
//		String name2 = student2.getName();
//		double gpa2 = student2.getGpa();
//		System.out.println("학생 " + name2 + "의 평점은 " + gpa2 + "입니다.");
	}
}
