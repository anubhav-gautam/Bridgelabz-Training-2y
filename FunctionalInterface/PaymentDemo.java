package FunctionalInterface;

interface PaymentProcessor {
    void pay();
    default void refund() {
        System.out.println("Refund processed successfully.");
    }
}

class Paytm implements PaymentProcessor {
    public void pay() {
        System.out.println("Payment done via Paytm.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        p.pay();
        p.refund();
    }
}