package p01.standard;

public class StudentExample {
	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 1);
		Student student2 = new Student("홍길동", 1);
		
		System.out.println("student1의 저장 번지값 : " + student1.hashCode());
		System.out.println("student2의 저장 번지값 : " + student2.hashCode());
		
		if (student1.equals(student2)) {
			System.out.println("동일인물입니다.");
		} else {
			System.out.println("다른인물입니다.");
		}
	}
}
