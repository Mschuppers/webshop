package Application.Bank;

public class BankAccount {

    private int accountNr;
    private double balance;
    private int interest;


    public BankAccount(int accountNr, double balance, int interest) {
        this.accountNr = accountNr;
        this.balance = balance;
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public int getInterest() {
        return interest;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNr=" + accountNr +
                ", balance=" + balance +
                '}';
    }
}
