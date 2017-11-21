package p02.standardAPI;

import java.util.function.IntSupplier;
/**
 * Supplier 함수적 인터페이스
 * 		- 매개변수가 없고 리턴문을 가진 추상 메소드
 * 			() -> {}
 * */
public class SupplierExample {
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			return (int) (Math.random() * 6);
		};
		int num = intSupplier.getAsInt();
		System.out.println("결과 : " + num);
	}
}
