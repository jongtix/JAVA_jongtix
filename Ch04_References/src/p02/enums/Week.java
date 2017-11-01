package p02.enums;
/**
 * 열거형 enum타입
 * - 몇 개의 상수값을 묶어서 사용하기 위한 객체
 * - 컴파일 시 Enum클래스를 자동 상속 받아서 생성
 * - name() : 열거 객체의 문자열 리턴 메소드 String 타입
 * - ordinal() : 열거 객체의 순번(0부터 시작) 리턴
 * - compareTo() : 열거 객체의 순번차이 리턴
 * - valueOf(String name) : 주어진 문자열의 열거 객체 리턴
 * - values() : 모든 열거 객체들을 배열로 리턴
 * */
public enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
