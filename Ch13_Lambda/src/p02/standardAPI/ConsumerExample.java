package p02.standardAPI;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/**
 * Consumer 타입 인터페이스
 * void 타입의 추상 메소드를 하나 가진 인터페이스
 * */
public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> {
			System.out.println(t + 8);
		};
		consumer.accept("java");
		
		// 두 개의 객체를 받아서 처리
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("java", "8");
		
		DoubleConsumer doubleconsumer = d -> System.out.println("java" + d);
		doubleconsumer.accept(8.0);
		
		// Object, 기본 데이터 타입을 받는 메소드
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);
	}
}
