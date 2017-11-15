package p13.times;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * time패키지(자바8추가)
 * LocalDate, LocalDateTime, ZoneId, ZonedDateTime
 * */
public class DateTimeInfoExample {
	public static void main(String[] args) {
		// 날짜 시간 객체 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년 ";
		strDateTime += now.getMonthValue() + "월 ";
		strDateTime += now.getDayOfMonth() + "일 ";
		strDateTime += now.getDayOfWeek() + " ";
		strDateTime += now.getHour() + "시 ";
		strDateTime += now.getMinute() + "분 ";
		strDateTime += now.getSecond() + "초 ";
		strDateTime += now.getNano() + "나노초";
		System.out.println(strDateTime);
		
		LocalDate nowDate = now.toLocalDate(); // LocalDate로 변경하는 메소드 toLocalDate();
		if (nowDate.isLeapYear()) { // 윤년 확인 메소드 isLeapYear();
			System.out.println("윤년(2월 29일까지 있습니다.");
		} else {
			System.out.println("평년(2월 28일까지 있습니다.");
		}
	}
}
