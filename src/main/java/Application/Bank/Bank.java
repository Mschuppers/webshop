package Application.Bank;
import java.util.ArrayList;

public class Bank {
    private String naam;
    private ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>();


    public Bank(String naam) {
        this.naam = naam;
    }

    public void addAccounts(BankAccount a) {
        listOfBankAccounts.add(a);
    }

    public double withdraw(BankAccount accountNr, double amount) {
        if (accountNr.getBalance() > amount) {
            accountNr.setBalance(accountNr.getBalance() - amount);
            return accountNr.getBalance();
        }
        return accountNr.getBalance();
    }


    public double deposit(BankAccount accountNr, double amount) {
        accountNr.setBalance(accountNr.getBalance() + amount);
        return accountNr.getBalance();
    }

    public void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
    }

    public void addInterestToAll() {
        for (BankAccount a : listOfBankAccounts) {
            a.setBalance(a.getBalance() * ((a.getInterest() / 100d) + 1));
        }
    }

    public void printAllAccounts() {
        for (BankAccount a : listOfBankAccounts) {
            System.out.println(a.toString());
        }
    }


}
