package p06.wildcard;

public class Course<T> {
	// 필드
	private String name; // 강좌명
	private T[] students; // 수강생
	
	// 생성자
	public Course(String name, int capacity) { // 수용인원
		this.name = name;
		students = (T[]) (new Object[capacity]); // 수강생 저장 배열 생성
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T[] getStudents() {
		return students;
	}
	public void setStudents(T[] students) {
		this.students = students;
	}
	
	public void add(T t) { // 수강생 등록 작업
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) { // 배열 중 비어있는 요소에 객체 저장
				students[i] = t;
				break;
			}
		}
	}
	
}
