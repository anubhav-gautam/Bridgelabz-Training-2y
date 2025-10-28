package FunctionalInterface;

@FunctionalInterface
interface Vehicle {
	void rent();
}

public class MultiVehicleRentalSystem {
	public static void main(String[] args) {
		
		Vehicle Car = () -> System.out.println("Car has been rented.");
		Vehicle Bike = () -> System.out.println("Bike has been rented.");
		Vehicle Bus = () -> System.out.println("Bus has been rented.");
		
		Car.rent();
		Bike.rent();
		Bus.rent();
	}
}
