package p01.standard;

public class Student {
	// 필드
	String name;
	int sno;

	// 생성자
	public Student(String name, int sno) {
		super();
		this.name = name;
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (name.equals(student.name) && sno == student.sno) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		if (this.name.equals(name))
			return sno;
		return 0;
	}
}
