package test;

import java.time.LocalDate;
import java.util.Scanner;

public class GoodsExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods goods = new Goods("새우깡", 1000);
		// 새우깡의 정상 가격은 1000원
		// 새우깡의 가격 다운 행사 기간은 2017-11-15 ~ 2017-11-18
		// 이 기간동안의 행사 가격은 800원(20%할인), 기간이 지나면 환원
		// Event 객체 생성해서 날짜 비교해서 상품 명과 상품 가격을 출력
		// 시작날짜, 종료날짜 입력 및 parse() 메소드 사용
		
		LocalDate startDate = LocalDate.parse("2017-11-15");
		LocalDate endDate = LocalDate.parse("2017-11-18");
		GoodsEvent goodsEvent = new GoodsEvent(goods, startDate, endDate);
		System.out.println("기간을 입력하세요>>");
		goodsEvent.check(scanner.next());
	}
}
