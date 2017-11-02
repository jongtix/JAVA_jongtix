package p01.classes;

public class CalcExample1 {
	public static void main(String[] args) {
		//객체(instance) 생성
		Calculator calculator = new Calculator();
		calculator.setField1(10); //생성된 instance의 메소드호출시 매개변수는 실제 값이 전달 됨.
		calculator.setField2(5); //생성된 instance의 메소드호출시 매개변수는 실제 값이 전달 됨.
		calculator.setOp('+'); //생성된 instance의 메소드호출시 매개변수는 실제 값이 전달 됨.
		
		calculator.calc(); //생성된 instance의 메소드호출시 매개변수는 실제 값이 전달 됨.
		calculator.getCalc();
	}
}
