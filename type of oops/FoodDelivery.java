import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String n,double p,int q){ this.itemName=n; this.price=p; this.quantity=q; }
    public String getItemName(){ return itemName; }
    public double getPrice(){ return price; }
    public int getQuantity(){ return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.println(itemName+" x"+quantity+" Price:"+price);
    }
}

interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String n,double p,int q){ super(n,p,q); }
    public double calculateTotalPrice(){ return getPrice()*getQuantity(); }
    public double applyDiscount(){ return calculateTotalPrice()*0.1; }
    public void getDiscountDetails(){ System.out.println("10% Discount on Veg Item"); }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String n,double p,int q){ super(n,p,q); }
    public double calculateTotalPrice(){ return getPrice()*getQuantity()+50; }
}

public class FoodDelivery {
    public static void main(String[] args){
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer",200,2));
        order.add(new NonVegItem("Chicken",300,1));

        for(FoodItem f: order){
            f.getItemDetails();
            double total = f.calculateTotalPrice();
            if(f instanceof Discountable){
                Discountable d=(Discountable)f;
                total -= d.applyDiscount();
            }
            System.out.println("Final Price: "+total);
        }
    }
}
