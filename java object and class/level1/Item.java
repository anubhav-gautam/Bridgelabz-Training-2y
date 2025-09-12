// Item.java
public class Item {
    // Attributes
    String itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Code  : " + itemCode);
        System.out.println("Name  : " + itemName);
        System.out.println("Price : $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an item object
        Item item1 = new Item("I001", "Wireless Mouse", 25.50);

        // Display item details
        item1.displayDetails();

        // Calculate and display total cost for a quantity
        int quantity = 4;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Cost   : $" + totalCost);
    }
}
