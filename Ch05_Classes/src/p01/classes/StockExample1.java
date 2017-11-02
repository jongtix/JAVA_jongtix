package p01.classes;

public class StockExample1 {
	public static void main(String[] args) {
		Stock stock = new Stock("새우깡", 10);
		stock.inStock(10);
		// 리턴 타입이 있는 메소드는 호출하면 결과값을 되돌려준다.
		// 리턴값을 호출한 쪽에 받아서 처리대도 되고 안 받아도 됨.
		System.out.println(stock.inStock(0));
		stock.outStock(10);
		stock.outStock(20);
		System.out.println(stock.getGoodsName() + stock.getQty());
	}
}
