package p13.times;

import java.time.LocalDateTime;

/**
 * time패키지
 * LocalDateTime 날짜 더하고 빼기
 * 더하기 plus + [년|월|일|시|분|초]
 * 빼기 minus + [년|월|일|시|분|초]
 * */
public class DateTimeOperationExample {
	public static void main(String[] args) {
		// 내 pc의 현재 날짜 시간 객체 생성
		LocalDateTime now = LocalDateTime.now(); // 현재 시간 now();
		System.out.println("현재 시 : " + now);
		
		LocalDateTime targetDateTime = now.plusYears(1).minusMonths(2).plusDays(3).plusHours(4).minusMinutes(5).plusSeconds(6); // 상대적 값을 적용하여 날짜를 변경하는 메소드
		System.out.println("타겟 시 : " + targetDateTime);
	}
}
