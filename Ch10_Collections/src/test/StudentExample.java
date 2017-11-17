package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentExample {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1, "홍길동"));
		students.add(new Student(2, "일지매"));
		students.add(new Student(1, "임꺽정")); // 번호 중복 -> 같은 논리적 동등 객체로 보고 저장하지 않게 처리
		
		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
	}
}
