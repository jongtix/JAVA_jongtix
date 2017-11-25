package interfacePackage;

public class Yourclass implements Myinterface{

	@Override
	public int getRandomNumber() {
		// TODO Auto-generated method stub
		return new java.util.Random().nextInt(10);
	}

	@Override
	public int getCeilNumber(double number) {
		// TODO Auto-generated method stub
		return (int) (number + 1);
	}

}
