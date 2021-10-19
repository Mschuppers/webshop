package Application.SysFiles;

import Application.Webshop.Artikel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import static Application.SysFiles.KlantBeheer.sc;

public class ArtikelBeheer {
    int jaar = Calendar.getInstance().get(Calendar.YEAR);
    ArrayList<Artikel> lijstVanArtikelen = new ArrayList<>();

    public Artikel registreerNieuwArtikel() {
        Artikel a = new Artikel(0, 0.00, "");
        Scanner sc = new Scanner(System.in);

        a.setId(lijstVanArtikelen.size() + 1);
        System.out.println("Geef een prijs op");
        a.setPrijs(sc.nextDouble());
        System.out.println("Geef een omschrijving op");
        a.setOmschrijving(sc.next());

        System.out.println("Toegevoegd: ArtikelId " + a.getId() + " Prijs: " + a.getPrijs() + "\nomschrijving: " + a.getOmschrijving());
        lijstVanArtikelen.add(a);
        return a;
    }

    public Artikel zoekArtikel(){
        System.out.println("Zoek welk artikel?");
        int artikelnummerTeVinden = sc.nextInt();
        for (Artikel a: lijstVanArtikelen) {
            if (artikelnummerTeVinden == a.getId()){
                return a;
            }
        }return null;
    }

    public boolean verwijderArtikel() {
        System.out.println("Welk ID verwijderen?");
        int i = sc.nextInt();
        for (Artikel a : lijstVanArtikelen) {
            if (i == a.getId()) {
                lijstVanArtikelen.remove(a);
                return true;
            }
        }
        return false;
    }

    public String printArtikelOverzicht() {
        return toString();
    }

    @Override
    public String toString() {
        return "\nArtikel overzicht " + jaar +
                " \nArtikelen beschikbaar in dit jaar" + lijstVanArtikelen;
    }
}
