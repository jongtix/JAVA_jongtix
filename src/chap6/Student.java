package chap6;

public class Student {
	String name;
	double gpa;
	
	public Student(String pName, double pGpa) {
		this.name = pName;
		this.gpa = pGpa;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
}
