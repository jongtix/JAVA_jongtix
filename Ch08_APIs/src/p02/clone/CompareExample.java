package p02.clone;

import java.util.Comparator;
import java.util.Objects;

/**
 * Comparable 인터페이스를 구현하지 않은 일반 클래스의 비교
 * - Comparator 인터페이스를 구현한 클래스를 하나 만들어서 두 객체를 비교할 수 있는 메소드로 비교하고
 *   Objects 클래스의 compare 메소드의 매개변수로 Comparator 구현체를 넘김
 * */
public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
		
	}
}

/**
 * 일반 객체를 비교할 수 있도록 레핑해주는 객체 생성
 * - Comparator<> 인터페이스를 구현한 객체를 생성
 *   <>은 비교할 객체만 대입되도록 타입을 제한하는 형제한자.
 * */
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
//		if (o1.sno == o2.sno) {
//			return 0;			
//		} else if (o1.sno > o2.sno) {
//			return 1;
//		} else {
//			return -1;
//		}
		
		return Integer.compare(o1.sno, o2.sno);
	}

	
	
}