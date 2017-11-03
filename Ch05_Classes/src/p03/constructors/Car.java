package p03.constructors;
/**
 * 클래스 구성의 3 요소 : 필드, 생성자, 메소드
 * - 생성자 오버로딩
 * 		동일한 이름의 생성자를 여러개 만드는 것(조건 : 매개변수의 타입 갯수가 달라야함.)
 * 
 * - this()메소드
 * 		동일 클래스 내에서 다른 생성자를 호출하는 메소드.
 * 		this()메소드는 만드시 실행부의 첫 줄에 기술되어야 함.
 * 
 * - 생성자를 여러개 만들어 사용하는 이유
 * 		객체를 만들기 위한 초기 데이터의 갯수가 달라질 수 있는 상황이 있기 때문.
 * */
public class Car {
	// 필드(멤버변수 or 전역변수)
	// - 클래스의 고유 속성, 현재 상태, 부품 객체를 저장하는 역할.
	String company;
	String model;
	int maxSpeed;
	int productYear;
	int currentSpeed;
	boolean engineStart;
	
	// 생성자
	// - 생성자는 클래스명과 같은 이름을 가진 메소드이며, 리턴 타입 키워드가 없음.
	// - 생성자의 역할은 필드들의 값을 초기화해줌
	public Car() {
		
	} // 매개 변수 없는 default 생성자
	Car(String company) {
		this.company = company;
	}
	Car(String company, String model) {
		this(company); // 매개변수 1 개짜리 생성자 호출
//		this.company = company;
		this.model = model;
	}
	Car(String company, String model, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	Car(String company, String model, int maxSpeed, int productYear) {
		this(company, model);
//		this.company = company;
//		this.model = model;
		this.maxSpeed = maxSpeed;
		this.productYear = productYear;
	}
	
	// 메소드
	void speedUp(int speed) {
		if (engineStart == false) {
			engineStart = true;
		}
		currentSpeed += speed;
	}
	void speedDown(int speed) {
		if (currentSpeed < speed) {
			currentSpeed = 0;
		} else {
			currentSpeed -= speed;			
		}
	}
	void stop() {
		currentSpeed = 0;
		engineStart = false;
	}
}
