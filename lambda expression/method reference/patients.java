import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P001", "P002", "P003");

        // Print each ID using method reference
        patientIds.forEach(System.out::println);
    }
}
