class Product {
    static double discount = 10;
    final String productID;
    String name;
    double price;
    int qty;

    Product(String name, double price, int qty, String productID) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.productID = productID;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void show() {
        if (this instanceof Product)
            System.out.println(productID + " | " + name + " | $" + price + " | Qty: " + qty + " | " + discount + "% off");
    }
}

public class CartTest {
    public static void main(String[] args) {
        Product p1 = new Product("Tablet", 300, 2, "P01");
        Product p2 = new Product("Mouse", 25, 1, "P02");

        p1.show();
        p2.show();

        Product.updateDiscount(15);
        System.out.println("\nUpdated Discount:");
        p1.show();
        p2.show();
    }
}
