package p01.ifs;
/**
 * if-else 둘 중 하나의 명령문을 실행히야 하는 경우
 * Math.abs(): 클래스.메소드명(); static 메소드
 *								  객체생성을 하지 않고 클래스명.메소드()형태로 바로 사용할 수 있는 메소드
 * 								  어느 클래스에서든 바로 호출가능(public)
 * - 수치연산용 클래스 Math클래스 , abs()메소드는 절댓값을 표시하는 static메소드
 */
public class If2Example {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[2]); //main의 매개변수 값
		if(a > 0) {
			System.out.println(a + "는 양의 정수입니다.");
		} else {
			System.out.println(a + "는 음의 정수입니다.");
		}
		System.out.println(a + "의 절대값은 " + Math.abs(a) + "입니다.");
	}
}
