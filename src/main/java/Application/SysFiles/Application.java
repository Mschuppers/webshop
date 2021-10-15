package Application.SysFiles;

import Application.Webshop.Catalogus;

public class Application {
    public static void main(String[] args) {
        boolean enabled = true;
        /*
         *Bank Application Data
         */
//        Bank abn = new Bank("Abn");
//        BankAccount a = new BankAccount(1, 100.00, 5);
//        BankAccount b = new BankAccount(2, 100.00, 5);
//
//        abn.addAccounts(a);
//        abn.addAccounts(b);
//        abn.withdraw(a, 50);
//        abn.deposit(a, 50);
//        abn.transfer(a, b, 50.0);
//        abn.addInterestToAll();
//
//        abn.printAllAccounts();

        /*
         * Webshop Application Data
         */

        SchermBeheer sB = new SchermBeheer();
        Catalogus c = new Catalogus(2021);


        while (enabled) {
            System.out.println("Opties beschikbaar");
            System.out.println("1) voeg klant toe");
            System.out.println("2) Toon alle klanten");
            System.out.println("3) Toon alle artikelen");
            sB.menuSelection();
        }

    }
}
