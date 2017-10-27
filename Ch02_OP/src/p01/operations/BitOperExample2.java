package p01.operations;
/**
 * 비트연산
 * - 자바의 특성상 두 피연산자중 하나가 int 타입보다 좁은 타입이면 둘 다 int 타입으로 자동 형변환을 한 후 연산이 저장됨.
 */
public class BitOperExample2 {
	public static void main(String[] args) {
		byte num1 = 1, num2 = 2;
		short num3 = 3;
		char ch = 'A';
		int num4 = 2;
		
		int result = num1 & num2; //byte 타입 & byte 타입의 결과는 int
		int result2 = num2 | num3; //byte 타입 | byte 타입의 결과는 int
		int result3 = num3 ^ ch; //short ^ char의 결과는 int
		int result4 = ~num1; //~byte의 결과는 int
		int result5 = num1 & num4;
	}
}
