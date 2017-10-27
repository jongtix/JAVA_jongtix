package chap11;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add();
		cal.add(10);
		cal.add(10, 5);
		cal.add("EXEM", "java");
		
		ChildCalculator childCal = new ChildCalculator();
		childCal.add();
		childCal.add(10);
		childCal.add(10, 5);
		childCal.add(10, 5.73);
		childCal.add("java", "잡아버려!");
		childCal.add("EXEM", "java", "잡아버려!");
	}
}
