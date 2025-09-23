class Product {
    String name;
    double quantity;
    double pricePerUnit;

    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getCost() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    Product[] products;

    Customer(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
}

class BillGenerator {
    public double calculateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.products) {
            total += p.getCost();
        }
        return total;
    }
}

public class GroceryBillApp {
    public static void main(String[] args) {
        Product[] items = {
            new Product("Apples", 2, 3),
            new Product("Milk", 1, 2)
        };
        Customer customer = new Customer("Alice", items);
        BillGenerator billGen = new BillGenerator();

        double totalBill = billGen.calculateBill(customer);

        System.out.println("Customer: " + customer.name);
        System.out.println("Total Bill: $" + totalBill);
    }
}
