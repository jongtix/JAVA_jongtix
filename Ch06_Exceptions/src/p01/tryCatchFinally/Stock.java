package p01.tryCatchFinally;
/**
 * private String 타입의 상품명
 * private String 타입의 제조사명
 * private int 타입의 qty
 * */
public class Stock {
	private String product;
	private String name;
	private int qty;
	
	public Stock() {
		super();
	}
	
	public Stock(String product) {
		super();
		this.product = product;
	}

	public Stock(String product, String name) {
		super();
		this.product = product;
		this.name = name;
	}
	
	public Stock(String product, String name, int qty) {
		super();
		this.product = product;
		this.name = name;
		this.qty = qty;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	// 입고처리 메소드
	void inStock(int qty) {
		this.qty += qty;
	}
	
	// 출고처리 메소드
	int outStock(int qty) throws Exception {
		if (this.qty < qty) {
			throw new OutOfBalanceException("재고량이 모자랍니다. 현재고 : " + this.qty);
		} else {
			this.qty -= qty;
			return qty;
		}
	}
}
