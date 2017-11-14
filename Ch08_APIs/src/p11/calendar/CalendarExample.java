package p11.calendar;

import java.util.Calendar;

/**
 * Calendar는 달력 정보를 가지고 있는 객체
 * */
public class CalendarExample {
	public static void main(String[] args) {
		// singleton : 생성자를 private로 막아서 외부에서 생성을 하지 못하게 하고,
		//			   getInstance() 메소드로 객체를 전달하는 방식
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int weekDay = now.get(Calendar.DAY_OF_WEEK);
		String week = "";
		switch (weekDay) {
		case 1:
			week = "일";
			break;
		case 2:
			week = "월";
			break;
		case 3:
			week = "화";
			break;
		case 4:
			week = "수";
			break;
		case 5:
			week = "목";
			break;
		case 6:
			week = "금";
			break;
		case 7:
			week = "토";
			break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		strAmPm = (amPm == 0) ? "오전" : "오후";
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + week + "요일 " + strAmPm + " " + hour + "시 " + minute + "분 " + second + "초");
	}
}
