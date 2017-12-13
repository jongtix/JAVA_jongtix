package p03.dataTypes;
/**
 * 데이터 타입, 리터럴
 * - 데이터 타입
 * 		정수 타입, 실수 타입
 * 		정수 타입의 기본타입은 int: 예) 10은 int타입의 10으로 인식,
 * 										010으로 표시하면 8진수로,
 * 										0x10으로 표시하면 16진수로 인식
 * 		실수 타입의 기본 타입은 double: 예) 12.375는 double타입 12.375로 인식,
 * 											12.375f로 표시하면 float타입의 12.375로 인식
 * 											10의 승수로 표시가능 ex) 2e3, 2e-6 등으로 숫자 중간에 e를 넣어 표시
*/
public class DataType6Exmaple {
	public static void main(String[] args) {
		double var1 = 3.14; //실수 데이터의 기본타입은 double
//		float var2 = 3.14;    float은 실수 데이터의 기본타입이 아니므로 실수리터럴 뒤에 f를 붙이지 않아서 오류발생.
		float var3 = 3.14f; //실수리터럴 + f로 표시된 float타입의 리터럴
		
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789f;
		
		System.out.println(var1);
//		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4); //출력시 소수부분은 double 타입에서 인정하는
		System.out.println(var5); //출력시 소수부분은 float 타입에서 인정하는
		
		int var6 = 3000000;
		double var7 = 3e6; //3 * 10^6
		float var8 = 3e6f; //3 * 10^6
		double var9 = 2e-3; // 2 * 10^(-3)
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}
}
