package p02.generics;
/**
 * Generic 타입으로 생성된 객체는 Casting이 일어나지 않음.
 * */
public class BoxExample2 {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		
		box1.set("Hello");
		String str = box1.get(); // box에 String 타입만 대입했기 때문에 Casting이 일어나지 않음
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.set(6);
		int value = box2.get(); // Casting이 일어나지 않음
		System.out.println(value);
	}
}
