package p02.clone;
/**
 * 객체의 복제는 Cloneable 인터페이스로 구현된 객체만 복제 가능함.
 * */
import java.util.Arrays;

public class Member implements Cloneable {
	// 필드
	public String name;
	public int age;
	public int [] scores;
	public Car car;
	
	// 생성자
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// 메소드
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 얕은 복제 - clone() : 원본의 내용이 그대로 복사
		//			 - 기본 데이터 타입은 실제 값이 복사
		//			 - 참조형 테이터 타입은 객체의 주소값이 복사 (원본과 복사본이 같은 객체를 공유하게 됨)
		//				-> 복사본의 객체를 수정하면 원본의 객체도 수정되어 복제가 무의미해짐
		//					=> 객체가 맴버인 경우는 객체의 껍데기를 새로 만들어서 내용을 다시 복제한다.(= 깊은 복제)
		Member cloned = (Member) super.clone(); // clone() 메소드의 리턴값은 Object이므로 Member 타입으로 casting하여 대입
		
		// scores를 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length); // copyOf(소스, 복사할 길이);
		
		// car 복제
		// 새로운 객체를 생성하여 생성자의 매개변수로 값을 넘김
		cloned.car = new Car(this.car.model);
		
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); // getMember() 메소드에서 clone() 메소드를 호출;
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return cloned;
	}
}
