package Application.SysFiles;

import Application.Webshop.Artikel;
import Application.Webshop.Catalogus;

import java.util.ArrayList;
import java.util.Scanner;

public class ArtikelBeheer {
ArrayList<Artikel> lijstVanArtikelen = new ArrayList<>();

    public Artikel registreerNieuwArtikel() {
        Artikel a = new Artikel(0, 0.00,"");
        Scanner sc = new Scanner (System.in);

        a.setId(lijstVanArtikelen.size()+1);
        System.out.println("Geef een prijs op");
        a.setPrijs(sc.nextDouble());
        System.out.println("Geef een omschrijving op");
        a.setOmschrijving(sc.next());

        System.out.println("Toegevoegd: ArtikelId "+a.getId()+ " Prijs: "+ a.getPrijs() + "\nomschrijving: "+ a.getOmschrijving());
        return a;
    }
}
