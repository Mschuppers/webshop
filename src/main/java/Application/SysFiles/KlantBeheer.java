package Application.SysFiles;

import Application.Webshop.Klant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KlantBeheer {
    ArrayList<Klant> lijstVanKlanten = new ArrayList<>();

    public void registreerNieuweKlant() {
        Klant k = new Klant(0, "","","","");
        Scanner sc = new Scanner (System.in);

        k.setId(lijstVanKlanten.size()+1);
        System.out.println("Geef een Voornaam op");
        k.setNaam(sc.next());
        System.out.println("Geef een Woonplaats op");
        k.setWoonplaats(sc.next());
        System.out.println("Geef een Wachtwoord op");
        k.setWachtwoord(sc.next());
        System.out.println("Geef een Emailadres op");
        k.setEmailadres(sc.next());
        lijstVanKlanten.add(k);
        System.out.println("Added: "+k.getId()+ " naam: "+ k.getNaam() + " te: "+ k.getWoonplaats());
    }

    public String toonAlleKlanten() {
        System.out.println("Alle klanten bekend bij ons \n");
            return toString();

        }




    public void verwijderKlant(Klant a) {
        lijstVanKlanten.remove(a);

    }

    @Override
    public String toString() {
        String s = Arrays.deepToString(lijstVanKlanten.toArray());
        return s;
    }
}
