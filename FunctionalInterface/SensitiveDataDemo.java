package FunctionalInterface;

interface SensitiveData {}

class CustomerInfo implements SensitiveData {
    String name = "Piyush";
    String card = "XXXX-XXXX-2006";
}

public class SensitiveDataDemo {
    public static void main(String[] args) {
        CustomerInfo c = new CustomerInfo();
        System.out.println("Sensitive Info: " + c.name + ", " + c.card);
    }
}