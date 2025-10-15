import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotificationFiltering {

    public static void main(String[] args) {
        // List of all alerts
        List<String> alerts = Arrays.asList(
            "Heart rate too high",
            "Low oxygen level",
            "Medication reminder",
            "Appointment tomorrow"
        );

        // User wants only critical alerts
        Predicate<String> criticalAlertsFilter = alert ->
            alert.contains("Heart rate") || alert.contains("oxygen");

        // Filter alerts using the Predicate and lambda
        List<String> filteredAlerts = alerts.stream()
                                            .filter(criticalAlertsFilter)
                                            .collect(Collectors.toList());

        // Output filtered alerts
        System.out.println("Filtered Alerts:");
        filteredAlerts.forEach(System.out::println);
    }
}
