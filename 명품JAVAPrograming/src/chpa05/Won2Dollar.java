package chpa05;

public class Won2Dollar extends Converter {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

	String srcString = "원";
	String destString = "달러";
	
	Won2Dollar (double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src/this.ratio;
	}

	@Override
	protected String getSrcString() {
		return this.srcString;
	}

	@Override
	protected String getDestString() {
		return this.destString;
	}

	

}
