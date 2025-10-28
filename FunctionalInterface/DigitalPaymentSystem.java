package FunctionalInterface;

@FunctionalInterface
interface Payment {
	void pay();
}

public class DigitalPaymentSystem {
	public static void main(String[] args) {
		
		Payment UPI = () -> System.out.println("Payment done using UPI.");
		Payment CreditCard = () -> System.out.println("Payment done using Credit Card.");
		Payment Wallet = () -> System.out.println("Payment done using Digital Wallet.");
		
		UPI.pay();
		CreditCard.pay();
		Wallet.pay();
	}
}
