class BankAccount{
    protected int accountNumber;
    protected int balance;
    
    public BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    
    public SavingsAccount(int accountNumber, int balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}

class CheckingAccount extends BankAccount{
    private int overdraftLimit;
    
    public CheckingAccount(int accountNumber, int balance, int overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }
}

class FixedDepositAccount extends SavingsAccount{
    private int depositTerm; // in months
    
    public FixedDepositAccount(int accountNumber, int balance, double interestRate, int depositTerm){
        super(accountNumber, balance, interestRate);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}

class BankAccountTypes{
    public static void main(String[] args){
        FixedDepositAccount fdAccount = new FixedDepositAccount(123456, 10000, 5.0, 12);
        CheckingAccount chkAccount = new CheckingAccount(654321, 5000, 1000);
        SavingsAccount savAccount = new SavingsAccount(112233, 2000, 3.5);
        System.out.println("Checking Account created with Account Number: " + chkAccount.accountNumber);
        chkAccount.displayAccountType();
        System.out.println("Savings Account created with Account Number: " + savAccount.accountNumber);
        savAccount.displayAccountType();
        System.out.println("Fixed Deposit Account created with Account Number: " + fdAccount.accountNumber);
        fdAccount.displayAccountType();
    }
}