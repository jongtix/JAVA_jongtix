package p03.constructors;
/**
 * 생성자의 overloading
 * - 클래스명(타입 변수, 타입 변수, 타입 변수 ...) {}
 * - 생성자의 이름은 동일하지만 매개변수의 타입, 갯수, 순서가 다른 형태
 * */
public class CarConstExample1 {
	public static void main(String[] args) {
		Car car1 = new Car(); // instance 생성
		Car car2 = new Car("현대자동차");
		Car car3 = new Car("현대자동차", "소나타");
		Car car4 = new Car("현대자동차", "소나타", 350);
		Car car5 = new Car("현대자동차", "소나타", 350, 2017);
		
		Car[] car = new Car[5];
		car[0] = car1;
		car[1] = car2;
		car[2] = car3;
		car[3] = car4;
		car[4] = car5;
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].company + "\t : \t" + car[i].model + "\t : \t" + car[i].maxSpeed + "\t : \t" + car[i].productYear + "\n");
		}
		
		car1.company = "현대자동차";
		car1.model = "그랜저";
		car1.maxSpeed = 450;
		car1.productYear = 2018;
		
		car2.model = "그랜저";
		car2.maxSpeed = 450;
		car2.productYear = 2018;
		
		car3.maxSpeed = 350;
		car3.productYear = 2018;
		
		car4.productYear = 2018;
		
		System.out.println();
		for (int i = 0; i < car.length; i++) {
			System.out.print(car[i].company + "\t : \t" + car[i].model + "\t : \t" + car[i].maxSpeed + "\t : \t" + car[i].productYear + "\n");
		}
	}
}
