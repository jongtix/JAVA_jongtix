package p13.times;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DatetimeChangeExample {
	public static void main(String[] args) {
		// 객체 생성
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 " + now);
		
		LocalDateTime targetDateTime = null;
		
		targetDateTime = now.withYear(2024).withMonth(10).withDayOfMonth(5).withHour(13); // 절대적 값을 적용하여 날짜를 변경하는 메소드
		System.out.println("타겟 " + targetDateTime);
		
		// 연도의 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올해의 첫 날 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막 날 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("내년의 첫 날 : " + targetDateTime);
		
		// 월의 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이 달의 첫 날 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이 달의 마지막 날 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음달의 첫 날 : " + targetDateTime);
		
		// 요일의 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이 달의 첫 월요일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + targetDateTime);
		targetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일 : " + targetDateTime);
	}
}
