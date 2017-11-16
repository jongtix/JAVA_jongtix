package test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GoodsEvent {
	Goods goods;
	LocalDate startDate;
	LocalDate endDate;
	
	public GoodsEvent(Goods goods, LocalDate startDate, LocalDate endDate) {
		this.goods = goods;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void check(String scanner) {
		LocalDate day = LocalDate.parse(scanner);
		
		if (day.isBefore(startDate) && day.isAfter(endDate)) {
			System.out.println("상품명 : " + goods.getName() + ", 가격 : " + (int) (goods.getPrice()*0.8));
		} else {
			System.out.println("상품명 : " + goods.getName() + ", 가격 : " + goods.getPrice());
		}
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
