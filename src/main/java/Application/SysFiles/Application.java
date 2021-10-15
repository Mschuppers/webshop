package Application.SysFiles;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

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
        int loggedIn = 1;


        

        while (loggedIn == 0) {
            System.out.println("Niet ingelogd");
            System.out.println("1) Voeg klant toe");
            System.out.println("2) Log in");
            sB.menuSelection();
        } 
        
        while (loggedIn == 1) {
            System.out.println("Ingelogd als gebruiker");
            System.out.println("1) Toon alle artikelen");
            System.out.println("2) Registreer nieuw Artikel");
            System.out.println("3) Voeg een artikel ID toe aan bestelling");
            System.out.println("4) Toon huidige bestelling");
            System.out.println("0) Log uit");
            sB.menuSelectionGebruiker();
        }

        while (loggedIn == 2) {
            System.out.println("Ingelogd als beheerder");
            System.out.println("Opties beschikbaar");
            System.out.println("1) voeg klant toe");
            System.out.println("2) Toon alle klanten");
            System.out.println("3) Verwijder klant");
            System.out.println("4) Toon alle artikelen");
            System.out.println("5) Verwijder artikel");
            System.out.println("0) Log uit");
            sB.menuSelectionBeheerder();
        }

    }
}
