package p01.classes;

public class Stock {
	// 속성
	private String goodsName;
	private int qty;

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	// 생성자
	Stock(String goodsName, int qty) {
		this.goodsName = goodsName;
		this.qty = qty;
	}

	// 입고
	public int inStock(int qty) {
		this.qty += qty;
		return this.qty;
	}

	// 출고
	public int outStock(int qty) {
		if (this.qty < qty) {
			System.out.println("재고가 부족합니다.");
			System.out.println("현재 " + this.goodsName + "의 재고는 " + this.qty + "개 입니다.");
			return qty;
		} else {
			this.qty -= qty;
			return qty;
		}
	}
}
