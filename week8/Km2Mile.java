package week8;

public class Km2Mile extends Converter {

	
	
	public Km2Mile(double r) {
		ratio = r;
	}

	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		
		return "mile";
	}

}
