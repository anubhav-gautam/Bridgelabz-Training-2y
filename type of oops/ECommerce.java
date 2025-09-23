import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String n, double p) {
        this.productId=id; this.name=n; this.price=p;
    }
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String n, double p) { super(id,n,p); }
    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public void getTaxDetails() { System.out.println("18% GST on Electronics"); }
}

class Clothing extends Product {
    public Clothing(int id, String n, double p) { super(id,n,p); }
    public double calculateDiscount() { return getPrice() * 0.2; }
}

class Groceries extends Product implements Taxable {
    public Groceries(int id, String n, double p) { super(id,n,p); }
    public double calculateDiscount() { return getPrice() * 0.05; }
    public double calculateTax() { return getPrice() * 0.05; }
    public void getTaxDetails() { System.out.println("5% GST on Groceries"); }
}

public class ECommerce {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Electronics(1,"Laptop",50000));
        cart.add(new Clothing(2,"Shirt",2000));
        cart.add(new Groceries(3,"Rice",1000));

        for(Product p: cart) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable)?((Taxable)p).calculateTax():0;
            double finalPrice = p.getPrice()+tax-discount;
            System.out.println(p.getName()+" Final Price: "+finalPrice);
        }
    }
}
