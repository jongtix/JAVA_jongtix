package p01.operations;

public class OperExample5 {
	public static void main(String[] args) {
		//변수 선언
		int a = 20, b = 30, max;
		//조건연산식
		max = a < b ? a : b;
		System.out.println(max);
		//조건문
		if ( a < b ) {
			max = a;
		} else {
			max = b;
		}
		System.out.println(max);
		
		int score = 95;
		char grade = ' '; //char 타입의 변수 초기화시 빈 문자로 초기화(' ')
						  //String 타입에서 변수 초기화시 빈 공백 없이("") 가능.
		if ( score > 90 ) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		System.out.println(grade);
		
		grade = ' ';
		grade = score > 90 ? 'A' : 'B';
		System.out.println(grade);
	}
}
