package interfacePackage;

public class MyClass3 implements Myinterface, YourInterface{

	@Override
	public int getRandomNumber() {
		return (int) Math.floor((Math.random() * 10));
	}

	@Override
	public int getCeilNumber(double number) {
		return (int) Math.ceil(number);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
//	public viod doSomething() {
//		System.out.println("뭔일인가???");
//	}
}
