import java.util.Arrays;
import java.util.List;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice: " + transactionId;
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> ids = Arrays.asList("TXN001", "TXN002", "TXN003");

        ids.stream()
           .map(Invoice::new)
           .forEach(System.out::println);
    }
}
