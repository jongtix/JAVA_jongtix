package p13.times;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
		System.out.println("시작 일 : " + startDateTime);
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
		System.out.println("종료 일 : " + endDateTime);
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 해 : " + remainYear);
		System.out.println("남은 달 : " + remainMonth); 
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		
		// between() 메소드 : 차이를 계산해서 출력
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(endDateTime, startDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.println("남은 해 : " + remainYear);
		System.out.println("남은 달 : " + remainMonth); 
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시간 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		
		System.out.println("[종료까지 남은 기간]");
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("남은 기간 : " + period.getYears() + "년 ");
		System.out.print(period.getMonths() + "달 ");
		System.out.print(period.getDays() + "일 남았습니다.");
		System.out.println();
	}
}
