package p06.wildcard;

import java.util.Arrays;

/**
 * wildcard(?)
 * */
public class WildCardExample {
	public static void registercourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents())); // 배열을 출력할 수 있는 문자열로 변환
	}
	public static void registercourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	public static void registercourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		// 출력
		registercourse(personCourse);
		registercourse(workerCourse);
		registercourse(studentCourse);
		registercourse(highStudentCourse);
		System.out.println();
//		registercourseStudent(personCourse);
//		registercourseStudent(workerCourse);
		registercourseStudent(studentCourse);
		registercourseStudent(highStudentCourse);
		System.out.println();
		registercourseWorker(personCourse);
		registercourseWorker(workerCourse);
//		registercourseWorker(studentCourse);
//		registercourseWorker(highStudentCourse);
	}
}
