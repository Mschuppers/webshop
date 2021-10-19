package Application.Webshop;

import java.util.ArrayList;
import java.util.Arrays;

public class Klant {

    private int id;
    private String naam;
    private String woonplaats;
    private String straatnaam;
    private String postcode;
    private String wachtwoord;
    private String emailadres;
    private int isBeheerder;
    public int bezorgmethode;

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
    public void setBezorgmethode(int bezorgmethode) {this.bezorgmethode = bezorgmethode;}
    public void setStraatnaamHuisnummer(String straatnaamHuisnummer) {this.straatnaam = straatnaamHuisnummer;}
    public void setPostcode(String postcode) {this.postcode = postcode;}

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

    public int getBezorgmethode() { return bezorgmethode; }

    /*
     *Implicit non var constructor
     */
    public Klant() {

    }



    ArrayList<Bestelling> lijstVanBestellingen = new ArrayList<>();

    public void voegAanBestelGeschiedenisToe(Bestelling a) {
        lijstVanBestellingen.add(a);

    }


    public Klant(int id, String naam, String woonplaats, int bezorgmethode, String emailadres,String wachtwoord,  int isBeheerder) {
        this.id = id;
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.wachtwoord = wachtwoord;
        this.bezorgmethode = bezorgmethode;
        this.emailadres = emailadres;
        this.isBeheerder = isBeheerder;
    }


    @Override
    public String toString() {
        String s = Arrays.deepToString(lijstVanBestellingen.toArray());

        return "\nid: " + id +
                "\nNaam: " + naam +
                "\nEmailadres: " + emailadres +
                "\nBestellingen: ";
    }



}
