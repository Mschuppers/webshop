package Application.Webshop;

import java.util.ArrayList;
import java.util.Arrays;

public class Klant {

    private int id;
    private String naam;
    private String woonplaats;
    private String wachtwoord;
    private String emailadres;
    private int isBeheerder;

    public void setEmailadres(String emailadres) {
        this.emailadres = emailadres;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
    public void setWachtwoord(String wachtwoord) {this.wachtwoord = wachtwoord;}

    public int getId() {
        return id;
    }
    public String getNaam() {
        return naam;
    }
    public String getWoonplaats() {
        return woonplaats;
    }
    public String getWachtwoord() {
        return wachtwoord;
    }
    public String getEmailadres() {
        return emailadres;
    }
    public int getIsBeheerder() {return isBeheerder;}

    /*
     *Implicit non var constructor
     */
    public Klant() {

    }


    private enum bezorgmethode {
        GEEN,
        BEZORGEN,
        AFHALEN,
        MAGAZIJN
    }

    ArrayList<Bestelling> lijstVanBestellingen = new ArrayList<>();

    public void voegAanBestelGeschiedenisToe(Bestelling a) {
        lijstVanBestellingen.add(a);

    }


    public Klant(int id, String naam, String woonplaats, String wachtwoord, String emailadres, int isBeheerder) {
        this.id = id;
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.wachtwoord = wachtwoord;
        this.emailadres = emailadres;
        this.isBeheerder = isBeheerder;
    }


    @Override
    public String toString() {
        String s = Arrays.deepToString(lijstVanBestellingen.toArray());

        return "\nid: " + id +
                "\nNaam: " + naam +
                "\nWoonplaats: " + woonplaats +
                "\nEmailadres: " + emailadres +
                "\nBeheerderrol: " + isBeheerder ;
    }

    public int hashCode() {
        return this.emailadres.hashCode() + +this.id+this.isBeheerder;
    }


}
