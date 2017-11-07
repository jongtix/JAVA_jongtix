package p08.employees;

public class SalaryMan extends Employee {
	// 필드
	private int annualSalary;
	
	
	public SalaryMan(String name) {
		super(name); // 매개변수 1 개짜리 부모 생성자 호출
	}
	
	public SalaryMan(String name, int annualSalary) {
		super(name); // = this(name); 매개변수 1 개짜리 부모 생성자 호출
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public int computePay() {
		
		return annualSalary/13;
	}
	
//	private int computeIncentive() {} // 부모 클래스에서 final로 선언된 메소드는 자식 클래스에서 수정 불가.

}
