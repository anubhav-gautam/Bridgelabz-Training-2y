import java.util.*;

class Account {
    String accNo; double bal;
    Account(String accNo, double bal) { this.accNo = accNo; this.bal = bal; }
}

class Customer {
    String name;
    List<Account> accs = new ArrayList<>();
    Customer(String name) { this.name = name; }
    void add(Account a) { accs.add(a); }
    void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account a : accs)
            System.out.println(a.accNo + " - $" + a.bal);
    }
}

class Bank {
    String name;
    Bank(String name) { this.name = name; }
    void openAccount(Customer c, String accNo, double bal) {
        c.add(new Account(accNo, bal));
        System.out.println("Opened " + accNo + " for " + c.name + " at " + name);
    }
}

public class Tester {
    public static void main(String[] args) {
        Bank b = new Bank("City Bank");
        Customer c1 = new Customer("Alice"), c2 = new Customer("Bob");

        b.openAccount(c1, "A100", 1000);
        b.openAccount(c1, "A101", 1500);
        b.openAccount(c2, "B200", 2000);

        c1.viewBalance(); System.out.println(); c2.viewBalance();
    }
}
