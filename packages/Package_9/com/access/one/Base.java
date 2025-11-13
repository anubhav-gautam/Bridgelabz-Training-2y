package Package.Package_9.com.access.one;

public class Base {
	public String car = "BMV";
	public void brand() {
		System.out.println("Brand: "+car);
	}
	
	private String model = "M8";
	public String getModel() {
		return model;
	}

	protected static String engine = "V8";
	
	void status() {
		System.out.println("Running...");
	}
}
