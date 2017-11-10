package p01.standard;
/**
 * <타입, 타입> : 형제한자(generic)
 * */
import java.util.HashMap;

public class StudentExample2 {
	public static void main(String[] args) {
		// 객체
		// HashMap<객체, 객체> => get(객체) -> 객체 리턴
		// int 타입에 Integer 타입의 값이 대입. <- (Auto-unboxing)
		HashMap<Student, Integer> student = new HashMap<>();
		student.put(new Student("홍길동", 1), 85); // int 타입이 Integer 타입으로 Promotion <- (Auto-boxing)
		student.put(new Student("일지메", 2), 90);
		student.put(new Student("임꺽정", 3), 80);
		try {
			int score = student.get(new Student("홍길동", 1));			
			
			System.out.println("성적 : " + score);
		} catch (NullPointerException e) {
			System.out.println("찾는 학생이 없습니다.");
		}
	}
}
