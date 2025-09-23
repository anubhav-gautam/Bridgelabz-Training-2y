public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 50.0; // Default rate
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = determineRate(carModel);
    }

    // Private method to determine daily rate based on car model
    private double determineRate(String model) {
        switch (model.toLowerCase()) {
            case "economy": return 30.0;
            case "standard": return 50.0;
            case "luxury": return 100.0;
            case "suv": return 80.0;
            default: return 50.0; // Default rate
        }
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Daily Rate: $%.2f\n", dailyRate);
        System.out.printf("Total Cost: $%.2f\n", calculateTotalCost());
    }
}
