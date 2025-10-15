import java.util.*;

// Product class
class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%s - Price: $%.2f, Rating: %.1f, Discount: %.0f%%", 
                name, price, rating, discount);
    }
}

public class ECommerceSorter {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 999.99, 4.5, 15),
            new Product("Phone", 499.99, 4.8, 10),
            new Product("Headphones", 199.99, 4.3, 25),
            new Product("Smartwatch", 249.99, 4.1, 20)
        );

        // Define different campaign sort strategies using lambdas
        Map<String, Comparator<Product>> sortStrategies = new HashMap<>();

        sortStrategies.put("black_friday", (p1, p2) -> Double.compare(p2.discount, p1.discount)); // High discount first
        sortStrategies.put("daily_deals", Comparator.comparingDouble(p -> p.price));              // Low price first
        sortStrategies.put("top_rated", (p1, p2) -> Double.compare(p2.rating, p1.rating));        // High rating first

        // Simulate a sales campaign
        String currentCampaign = "black_friday"; // Try "daily_deals" or "top_rated"

        // Sort products based on campaign
        Comparator<Product> comparator = sortStrategies.get(currentCampaign);

        if (comparator != null) {
            products.sort(comparator);
            System.out.println("Sorted by: " + currentCampaign);
            products.forEach(System.out::println);
        } else {
            System.out.println("No sorting strategy found for: " + currentCampaign);
        }
    }
}
