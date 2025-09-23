class Vehicle {
    static double fee = 500;
    final String regNo;
    String owner, type;

    Vehicle(String owner, String type, String regNo) {
        this.owner = owner;
        this.type = type;
        this.regNo = regNo;
    }

    static void updateFee(double f) {
        fee = f;
    }

    void show() {
        if (this instanceof Vehicle)
            System.out.println(regNo + " | " + owner + " | " + type + " | $" + fee);
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ana", "Car", "V001");
        Vehicle v2 = new Vehicle("Leo", "Bike", "V002");
        v1.show(); v2.show();
        Vehicle.updateFee(650);
        System.out.println("\nAfter update:");
        v1.show(); v2.show();
    }
}
