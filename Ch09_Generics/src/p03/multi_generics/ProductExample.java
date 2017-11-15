package p03.multi_generics;
/**
 * 멀티 제네릭타입<T, M, P>
 * <> 안에 선언된 세 개의 타입만으로 처리해야함.
 * */
public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String, Integer> product = new Product<>(); // 왼쪽에 <T, M, P>가 있으므로 생략가능(자바7에서 추가)
		product.setKind(new Tv());
		product.setModel("스마트Tv");
		product.setPrice(new Integer(1000000));
		product.setQty(10);
		
		Tv tv = product.getKind();
		String tvModel = product.getModel();
		int price = product.getPrice();
		int qty = product.getQty();
		System.out.println(tv + " " + tvModel + " " + price + " " + qty);
	}
}
