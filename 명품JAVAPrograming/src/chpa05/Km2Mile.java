package chpa05;

public class Km2Mile extends Converter {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

	String srcString = "Km";
	String destString = "mile";
	
	Km2Mile (double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		return src / this.ratio;
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
