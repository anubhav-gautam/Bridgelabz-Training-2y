package FunctionalInterface;

@FunctionalInterface
interface Device {
	void turnOn();
}

public class SmartDevices {
	public static void main(String[] args) {
		
		Device Light = () -> System.out.println("Light is turned ON.");
		Device AC = () -> System.out.println("AC is turned ON.");
		Device TV = () -> System.out.println("TV is turned ON.");
		
		Light.turnOn();
		AC.turnOn();
		TV.turnOn();
	}
}
