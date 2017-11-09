package p01.tryCatchFinally;
/**
 * 상품명 goodsName
 * 상품 가격 price
 * */
public class Goods {
	final int LIMIT = 200;
	
	String goodsName;
	int price;
	
	public Goods() {
		super();
	}
	
	public Goods(String goodsName) {
		super();
		this.goodsName = goodsName;
	}
	
	public Goods(String goodsName, int price) {
		super();
		this.goodsName = goodsName;
		this.price = price;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void upPrice(int amount) throws Exception {
		if (amount > LIMIT) {
			throw new LimitOutException();
		}
		price += amount;
	}
	
	void downPrice(int amount) throws Exception {
		if (amount > LIMIT) {
			throw new LimitOutException();
		}
		price -= amount;
	}
	
}
