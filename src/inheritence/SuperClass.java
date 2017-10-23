package inheritence;

public class SuperClass {
	private int num;
	private String name;
	
	public SuperClass() {
		
	}
	
	public SuperClass(int num, String name) {
		
	}
	
	public void printMessage() {
		System.out.println("슈퍼클래스의 수: " + this.num + 
						   "\n슈퍼클래스의 이름: " + this.name);
	}
}
