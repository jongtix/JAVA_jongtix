package referenceType;

public class MyClass {
	private int num;
	private String name;
	
	private static String staticVar;
	
	public MyClass() {
		this.num = 5;
		this.name = "삼다수";
	}
	
	public MyClass(int num) {
		this();
		this.num = num;
//		this.name = "삼다수";
	}
	
	public MyClass(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
//		System.out.println(staticVar);
//		System.out.println(getClassName());
		return this.name;
	}
	
	public static String getClassName() {
		System.out.println(staticVar);
		return "이 클래스는 Myclass이다.";
	}
}
