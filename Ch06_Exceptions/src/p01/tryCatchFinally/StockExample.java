package p01.tryCatchFinally;

public class StockExample {
	public static void main(String[] args) {
		// 객체 생성
		Stock stock = new Stock("새우깡", "농심", 50);
		System.out.println(stock.getProduct() + "의 현 재고는 : " + stock.getQty());
		
		// 입고 처리
		stock.inStock(20);
		
		// 출고 처리
		try {
			stock.outStock(90);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
