package Application;

import Application.Bank.Bank;
import Application.Bank.BankAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTester {
    @Test
    void withdraw() {
        BankAccount a = new BankAccount(5,100.0,5);
        Bank test = new Bank("Abn");

        test.withdraw(a,75.00);

        assertEquals( 25.00,a.getBalance());
    }

    @Test
    void deposit() {
        BankAccount a = new BankAccount(5,100.0,5);
        Bank test = new Bank("abn");

        test.deposit(a,75.00);

        assertEquals( 175,a.getBalance());
    }

    @Test
    void transfer() {
        BankAccount a = new BankAccount(5,100.0,5);
        BankAccount b = new BankAccount(7,50.0,5);
        Bank test = new Bank("Abn");

        test.transfer(a,b,25.00);

        assertEquals( 75,a.getBalance());
    }


    @Test
    void interest() {
    }

    @Test
    void sumBalances() {
    }
}