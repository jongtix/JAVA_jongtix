package p03.methods;

public class CalculatorExample3 {
	public static void main(String[] args) {
		Calculator3 myCal = new Calculator3();
		
		//정사각형의 넓이
		myCal.areaRectangle(10);
		
		//직사각형의 넓이
		myCal.areaRectangle(10, 20);
		
		//결과출력
		System.out.println("정사각형의 넓이 : " + myCal.areaRectangle(10));
		System.out.println("직사각형의 넓이 : " + myCal.areaRectangle(10, 20));
	}
}
