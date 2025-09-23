import java.util.*;

class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name; this.price = price;
    }
}

class Order {
    List<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
    void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products)
            System.out.println(" - " + p.name + " ($" + p.price + ")");
    }
}

class Customer {
    String name;
    Customer(String name) { this.name = name; }
    void placeOrder(Order o) {
        System.out.println(name + " placed an order:");
        o.showOrder();
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Phone", 599.99);
        Product p2 = new Product("Headphones", 89.99);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        Customer c = new Customer("Alice");
        c.placeOrder(order);
    }
}
