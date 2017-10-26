package p02.variables;
/**
 * static메소드에서 사용될 변수는 반드시 static으로 선언되어야함.
 * 클래스내에서 선언된 전역변수는 초기화를 하지 않으면 해당 데이터 타입의 초기값으로 초기화됨.
 * int는 0, String은 null, 배열도 null로 치기화됨.
 * 로컬변수 메소드 내에서 선언되는 변수들은 반드시 초기화 해줘야함.
 * */
public class VariableScopeEx2 {
	//전역변수 선언
	static int i; //instance변수, 전역변수는 초기화를 하지 않으면
				  //해당데이터 타입의 초기값으로 초기화 됨.
	public static void main(String[] args) {
		//로컬변수 선언
		int j = 0;
		System.out.println("i = " + i); //오류발생 - static 선언을 안해서 발생한 오류
		System.out.println("j = " + j); //오류발생 - 초기화를 안해서 발생한 오류
	}
}
