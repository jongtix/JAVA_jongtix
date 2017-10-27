package p03.dataTypes;
/**
 * 논리타입 boolean(true/false) 
*/
public class DataTypeExample7 extends Object { //모든 클래스는 자바 최상위 클래스인 Object에서 상속받아 생성된다.
	//생성자 - 클래스명과 동일한 이름을 가진 리턴타입이 존재하지 않는 메소드
	DataTypeExample7() {}
	//변수 선언
	public static void main(String[] args) {
		boolean stop = true; //boolean 타입의 초기값으로 true값을 저장
		
		// if()문: ()안의 값이나 식의 결과값이 참이면 {}내의 명령문을 실행
		//									   거짓이면 {}을 지나침.
		if(stop) { //stop이라는 변수의 값이 true/false를 확인
			System.out.println("정지");
		} else {
			System.out.println("진행");
		}
		
		if(stop == true) { //stop == true라는 식의 결과값이 true/false를 확인
			System.out.println("정지");
		} else {
			System.out.println("진행");
		}
	}
}
