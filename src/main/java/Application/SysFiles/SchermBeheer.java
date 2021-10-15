package Application.SysFiles;


import java.util.Scanner;

public class SchermBeheer {
    ArtikelBeheer aB = new ArtikelBeheer();
    KlantBeheer kB = new KlantBeheer();
    BestelBeheer bB = new BestelBeheer();

    public int menuSelection() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        switch (input) {
            case 1:
                kB.registreerNieuweKlant();
                break;
            case 2:
                return 1;
            case 22:
                return 2;
            case 3:
                System.out.println(aB.printArtikelOverzicht());
                break;
        }
        return 0;


    }

    public void menuSelectionGebruiker() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println(aB.printArtikelOverzicht());
                break;

            case 2:
                aB.registreerNieuwArtikel();
                break;

            case 3:
                bB.nieuweBestelling(aB.zoekArtikel());
                break;
            case 4:
                System.out.println(bB.printBestelOverzicht());
                break;
        }
    }

    public int menuSelectionBeheerder() {
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
                kB.verwijderKlant();
                break;

            case 4:
                System.out.println(aB.printArtikelOverzicht());
                break;

            case 5:
                aB.verwijderArtikel();
                break;

            case 0:
                return 0;

        }
        return 2;
    }


}
