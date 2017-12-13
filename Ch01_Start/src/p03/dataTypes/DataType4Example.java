package p03.dataTypes;
/**
 * 16진수표기: 0x로 시작
 * 8진수표기: 0으로 시작 
 */
public class DataType4Example {
	public static void main(String[] args) {
		boolean varb = true;
		byte var_byte = 127; // -128 ~ 127
		short var_short = 32767;
		char var_char1 = 66; // 0 ~ 65535
		System.out.println(var_char1); // B
		char var_char2 = 'A';
		char var_char31 = '가'; // char타입에 값을 입력시 '가'입력
		char var_char32 = '\uac00'; // 'unicode를 입력해도 동일한 결과가 나옴
		System.out.println("var_char31 = " + var_char31);
		System.out.println("var_char32 = " + var_char32);		
		System.out.println("한글");
		System.out.println('\ud55c'); // '한'의 2byte표기: 1101010101011100(2)
		System.out.println('\uae00'); // '글'의 2byte표기: 1010111000000000(2)
	}
}
