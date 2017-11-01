package p02.enums;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		//열거형 객체 생성
		Week today = null; //today는 열거 타입의 참조변수.
		//Calendar는 내 PC의 시스템 타임을 참조하여 현재 시점의 날짜를 리턴하는 객체
		Calendar cal = Calendar.getInstance(); //캘린더 객체를 얻어 옴
		int week = cal.get(Calendar.DAY_OF_WEEK); //Calendar 객체로부터 지금 요일을 얻어 옴
		System.out.println("week의 번호 : " + week);
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			break;
		}
		System.out.println("오늘의 요일은 " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("오늘은 쉽니다.");
		} else {
			System.out.println("열심히 공부를 합니다.");
		}
	}
}
