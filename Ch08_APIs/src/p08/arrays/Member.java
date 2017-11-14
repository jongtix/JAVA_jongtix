package p08.arrays;
/**
 * 객체의 비교는 동일한 타입끼리 해야함.
 * - 비교할 수 있는 객체를 만들기 위해서는 Comparable 인터페이스를 구현해야함.
 * - 객체의 비교는 기준이 있어야함.
 * 		- name으로 객체를 비교
 * */
public class Member implements Comparable<Member>{
	// 필드
	String name;

	// 생성자
	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
//		if (this.name.equals(o.name)) {
//			return 0;			
//		} else {
//			return -1;
//		}
		return name.compareTo(o.name); // String의 compareTo() 메소드는 두 문자열의 길이 중 작은 길이까지만 비교함.
									   // 제일 앞의 값끼리 비교해서 크기가 크면 양수, 작으면 음수, 같으면 0을 리턴
									   // 한글의 값 비교는 유니코드끼리 비교
	}
	
	
}
