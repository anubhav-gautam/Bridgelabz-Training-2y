// BankAccount.java
public class BankAccount {
    // Attributes
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account1 = new BankAccount("Priya Kapoor", "ACC123456", 1000.00);

        // Perform some operations
        account1.displayBalance();
        System.out.println();

        account1.deposit(500.00);
        account1.displayBalance();
        System.out.println();

        account1.withdraw(300.00);
        account1.displayBalance();
        System.out.println();

        account1.withdraw(1500.00);  // Insufficient balance
        account1.displayBalance();
    }
}
