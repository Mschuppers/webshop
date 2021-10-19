package Application.SysFiles;

import Application.Webshop.Klant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KlantBeheer {
    ArrayList<Klant> lijstVanKlanten = new ArrayList<>();


    public void defaultInitialisation(){
        Klant administrator = new Klant(0, "admin", "admin", "a", "a", 2);
        Klant maker = new Klant(1, "Marco", "IJmuiden", "m", "m", 1);

        lijstVanKlanten.add(administrator);
        lijstVanKlanten.add(maker);
        System.out.println(administrator);
    }

    static Scanner sc = new Scanner(System.in);

    public void registreerNieuweKlant() {
        Klant k = new Klant(lijstVanKlanten.size() + 1, "", "", "", "", 1);
        System.out.println("Geef een Voornaam op");
        k.setNaam(sc.nextLine());
        System.out.println("Geef een Woonplaats op");
        k.setWoonplaats(sc.next());
        System.out.println("Geef een Wachtwoord op");
        k.setWachtwoord(sc.next());
        System.out.println("Geef een Emailadres op");
        k.setEmailadres(sc.next());
        lijstVanKlanten.add(k);
        System.out.println("Added: " + k.getId() + " naam: " + k.getNaam() + " te: " + k.getWoonplaats());
    }

    public void registreerNieuweBeheerder() {
        Klant k = new Klant(lijstVanKlanten.size()+1, "", "", "", "", 2);
        registreerNieuweKlant();

        lijstVanKlanten.add(k);
        System.out.println("Added: " + k.getId() + " naam: " + k.getNaam() + " te: " + k.getWoonplaats());

    }

    public String toonAlleKlanten() {
        System.out.println("Alle klanten bekend bij ons \n");
        return toString();

    }

    public int logKlantIn(String emailadres, String wachtwoord) {
        int loggedInAs = 0;
        for (Klant a : lijstVanKlanten) {
            if (emailadres.equals(a.getEmailadres()) && wachtwoord.equals(a.getWachtwoord())){
                if (a.getIsBeheerder() == 2) {
                    loggedInAs = 2;
                } else {
                    loggedInAs = 1;
                }
                return loggedInAs;

            }
        }
        return loggedInAs;
    }

    public void verwijderKlant() {
        System.out.println("Welk ID verwijderen?");
        int i = sc.nextInt();
        lijstVanKlanten.removeIf(a -> i == a.getId());
    }



    @Override
    public String toString() {
        return Arrays.deepToString(lijstVanKlanten.toArray());
    }
}
