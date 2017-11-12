package chpa06;

import java.util.Calendar;

public class p05 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int todayHour = today.get(Calendar.HOUR);
		int todayMinute = today.get(Calendar.MINUTE);
		int todayHourOfDay = today.get(Calendar.HOUR_OF_DAY);
		System.out.println("현재 시간은 " + todayHour + "시 " + todayMinute + "분입니다.");
		if (todayHourOfDay >= 4 && todayHourOfDay < 12) {
			System.out.println("Good Morning");
		} else if (todayHourOfDay >= 12 && todayHourOfDay < 18) {
			System.out.println("Good Afternoon");
		} else if (todayHourOfDay >= 18 && todayHourOfDay < 22) {
			System.out.println("Good Evening");
		} else {
			System.out.println("Good Night");
		}
	}
}
