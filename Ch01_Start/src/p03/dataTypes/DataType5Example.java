package p03.dataTypes;
/**
 * 데이터 타입
 * 변수의 값을 초기화 하기 위한 값(리터럴)을 숫자로 표시할 때
 * 정수, 8진수, 16진수로 표기할 수 있음.
 * 8진수리터럴은 숫자 앞에 0을 붙임 ex) 010;
 * 16진수리터럴은 숫자 앞에 0x를 붙임 ex) 0x10; 
 */
public class DataType5Example {
	public static void main(String[] args) {
		int var1 = 10; //10진수 리터럴
		int var2 = 010; //8진수 리터럴
		int var3 = 0x10; //16진수 리터럴
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		//32 출력
		int var4 = 32;
		int var5 = 040;
		int var6 = 0x20;
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		//10 출력
		int var7 = 10;
		int var8 = 012;
		int var9 = 0xa;
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}
}
