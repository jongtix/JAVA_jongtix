package p01.classes;
/**
 * 클래스 - 객체(Object)를 자바에서 구체화한 설계도
 * 클래스의 선언
 * 		접근제한자 class 클래스명 {
 * 			//속성
 * 			//기능
 * 		}
 * */
//사람은 이름과 나이라는 속성이 있고, 웃고 먹는 기능을 가지고 있다.
public class Person2 {
	//생성자 - 모든 클래스는 생성자가 반드시 필요
	//배개변수가 없는 형태의 생성자 : default(기본생성자)
	//클래스 작성시 기본생성자를 기술하지 않으면 컴파일 시 자동으로 추가해줌
	//생성자의 역할 - 객체 생성 직후 초기화를 해줌.
	Person2() {}
	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//속성
	private String name;
	private int age;
	
	//기능
	public void smile() {
		System.out.println(name + "이 웃습니다.");
	}
	public void eat() {
		System.out.println(name + "이 먹습니다.");
	}
	
	public void setName(String name) {
		this.name = name; //this는 클래스 자신
	}
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("오류");
			return; //메소드에서 return;문을 만나면 아래부분은 실행하지 않고 다시 호출한 쪽으로 이동.
		} else {
			this.age = age; //this는 클래스 자신			
		}
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
