// CartItem.java
public class CartItem {
    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get total price of this item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Display item details
    public void displayItem() {
        System.out.println(itemName + " | $" + price + " x " + quantity + " = $" + getTotalPrice());
    }
}
