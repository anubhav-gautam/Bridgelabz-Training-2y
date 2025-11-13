package Package.Package_9.com.access.two;
import Package.Package_9.com.access.one.*;

public class Derived extends Base {
	public static void main(String[] args) {
		Base base = new Base();
		base.brand();
		System.out.println(base.getModel());
		System.out.println(engine);
//		base.status(); ////This won't be accessed by the child class 
	}
}
