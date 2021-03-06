package p04.set;

public class Member extends Object {
	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	// 객체의 논리적 동등비교는 equals() 메소드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
}
