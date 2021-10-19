package Application.SysFiles;


import java.util.Scanner;

public class SchermBeheer {
    ArtikelBeheer aB = new ArtikelBeheer();
    KlantBeheer kB = new KlantBeheer();
    BestelBeheer bB = new BestelBeheer();



    public void menuSelection() {
        kB.defaultInitialisation();
        System.out.println("Welkom bij de marktplaats \nGeef uw keuze op \n1) Registreer nieuwe klant \n2)Login");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                kB.registreerNieuweKlant();
                menuSelection();
                break;
            case 2:
                System.out.println("Graag uw email & wachtwoord");

                int loggedInAs = kB.logKlantIn(sc.next(), sc.next());
                while (loggedInAs == 1) {
                    menuSelectionGebruiker();
                }
                while (loggedInAs == 2) {
                    menuSelectionBeheerder();
                }
                while (loggedInAs == 0) {
                    menuSelection();
                    break;
                }
        }
    }

    public void menuSelectionGebruiker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welkom bij het gebruikersmenu " +
                "\nMaak uw selectie" +
                "\n1)Artikeloverzicht" +
                "\n2)Nieuw artikeltoevoegen " +
                "\n3)Nieuwe bestelling maken" +
                "\n4)Besteloverzicht tonen");

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
            case 0:
                menuSelection();
                break;
        }
    }

    public void menuSelectionBeheerder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welkom bij het beheerdersmenu" +
                "\nMaak uw keuze" +
                "\n1) Registreer een nieuwe klant" +
                "\n2) Toon alle beschikbare klanten" +
                "\n3) Verwijder een klant" +
                "\n4) Toon alle artikelen" +
                "\n5) Verwijder een artikel" +
                "\n6) Registreer een nieuwe beheerder");

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
            case 6:
                kB.registreerNieuweBeheerder();
                break;
            case 0:
                menuSelection();
                break;
        }

    }


}
