package p03.singletone;

public class SingleToneExample1 {
	public static void main(String[] args) {
//		SingleTone obj1 = new SingleTone(); // private로 지정하여 오류 발생
		SingleTone obj2 = SingleTone.getInstance();
		SingleTone obj3 = SingleTone.getInstance();
		
		if (obj2 == obj3) {
			System.out.println("같은 SingleTone객체 입니다.");
		} else {
			System.out.println("다른 SingleTone객체 입니다.");
		}
	}
}
