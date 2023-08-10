package Shopping;

public class SmartTV extends Product {

	String resolution;

	@Override
	public void printExtra() {
		System.out.println("해상도:" + resolution);

	}

	public SmartTV(String pname, int price, String resolution) {
		super();
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}

}
