package p08.abstracts;
/**
 * 추상클래스 - 실체가 없는 클래스
 * 			  - 메소드들은 선언부만 존재하고, 실행부는 없는 추상 메소드들만 있음.
 * 			  - 추상 클래스는 자신을 new 생성자()로 객체를 생성할 수 없음.
 * 				-> 상속을 받은 자식의 클래스로 객체를 생성할 수 있음.
 * 			  - 추상 메소드는 상속받은 자식 클래스에서 반드시 재정의(실행부 추가)해야 함.
 * */
public abstract class Animal {
	//메소드 선언
	public abstract void sing(); //운다 기능은 이 메소드를 사용
	public abstract void fly(); //난다 기능은 이 메소드를 사용
	public abstract void eat(); //먹는다 기능은 이 메소드를 사용 
}
