import java.util.*;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int acc,String name,double bal){
        this.accountNumber=acc; this.holderName=name; this.balance=bal;
    }
    public int getAccountNumber(){ return accountNumber; }
    public String getHolderName(){ return holderName; }
    public double getBalance(){ return balance; }

    public void deposit(double amt){ balance+=amt; }
    public void withdraw(double amt){ if(balance>=amt) balance-=amt; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc,String n,double b){ super(acc,n,b); }
    public double calculateInterest(){ return getBalance()*0.04; }
    public void applyForLoan(){ System.out.println("Savings Loan Applied"); }
    public boolean calculateLoanEligibility(){ return getBalance()>5000; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int acc,String n,double b){ super(acc,n,b); }
    public double calculateInterest(){ return getBalance()*0.02; }
}

public class Banking {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101,"Amit",10000));
        accounts.add(new CurrentAccount(102,"Ravi",20000));

        for(BankAccount acc: accounts){
            System.out.println(acc.getHolderName()+" Interest: "+acc.calculateInterest());
            if(acc instanceof Loanable){
                Loanable l=(Loanable)acc;
                l.applyForLoan();
                System.out.println("Eligible? "+l.calculateLoanEligibility());
            }
        }
    }
}
