package Application.SysFiles;

import Application.Webshop.Artikel;
import Application.Webshop.Catalogus;

import java.util.Scanner;

public class SchermBeheer {
    ArtikelBeheer aB = new ArtikelBeheer();
    KlantBeheer kB = new KlantBeheer();
    Catalogus c = new Catalogus(2021);


    public void menuSelection() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        switch (input) {
            case 1:
                kB.registreerNieuweKlant();
                break;

            case 2:
                System.out.println(kB.toonAlleKlanten());
                break;

            case 3:
                System.out.println(c.printCatalogus());
                break;
            case 4:
                c.voegToeAanCatalogus(aB.registreerNieuwArtikel());
        }


    }

}
