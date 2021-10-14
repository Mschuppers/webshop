package Application.SysFiles;

import Application.Webshop.Artikel;
import Application.Webshop.Bestelling;
import Application.Webshop.Catalogus;
import Application.Webshop.Klant;

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
        Catalogus Jaar2021 = new Catalogus(2021);
        Klant Marco = new Klant("Marco", "IJmuiden");
        Bestelling best = new Bestelling();
        Bestelling best2 = new Bestelling();

        Artikel a = new Artikel(1, 12.99, "Sleutelhanger");
        Artikel b = new Artikel(2, 22.24, "Webcambeschermer");
        Artikel c = new Artikel(3, 89.33, "Lampenkap deluxe");

        Jaar2021.voegToeAanCatalogus(a);
        Jaar2021.voegToeAanCatalogus(b);
        Jaar2021.voegToeAanCatalogus(c);
        Jaar2021.printCatalogus();

        best.voegToeAanBestelling(a);
        best.voegToeAanBestelling(c);

        best2.voegToeAanBestelling(c);
        best2.voegToeAanBestelling(b);

        Marco.voegAanBestelGeschiedenisToe(best);
        Marco.voegAanBestelGeschiedenisToe(best2);
        best.berekenTotaal();
        best2.berekenTotaal();
        System.out.println(Marco);

    }
}
