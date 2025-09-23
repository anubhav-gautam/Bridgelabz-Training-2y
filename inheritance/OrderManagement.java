import java.util.Date;

class Order {
    protected String orderId;
    protected Date orderDate;

    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, Date orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    protected Date deliveryDate;

    public DeliveredOrder(String orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD123", new Date());
        System.out.println("Order Status: " + order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder("ORD124", new Date(), "TRK98765");
        System.out.println("Order Status: " + shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", new Date(), "TRK12345", new Date());
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());
    }
}
