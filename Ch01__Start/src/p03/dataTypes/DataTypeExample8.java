package p03.dataTypes;

public class DataTypeExample8 {
	public static void main(String[] args) {
		//변수
		char charValue1 = '가'; //' '문자 리터럴
		char charValue2 = '한';
		char charValue3 = '글';
		
		//int타입(값만 저장할 수 있음)을 객체화한 클래스(값 저장 + 메소드)
		//"문자열" 내에서 특수문자(이스케이프문자) 표기 시 \후에 문자를 입력
		System.out.println("\'가\'의 2진법 표기법 : " + Integer.toBinaryString(charValue1));
		System.out.println("\'한\'의 2진법 표기법 : " + Integer.toBinaryString(charValue2));
		System.out.println("\'글\'의 2진법 표기법 : " + Integer.toBinaryString(charValue3));
		
		System.out.println("\'가\'의 16진법 표기법 : " + Integer.toHexString(charValue1));
		
		String str = "\\" + "u" + Integer.toHexString(charValue1);
		System.out.println(str);
		System.out.println('\uac00');
		System.out.println("'" + str + "'");
		
	}
}
