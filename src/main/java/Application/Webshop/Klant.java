package Application.Webshop;

import java.util.ArrayList;
import java.util.Arrays;

public class Klant {

    private int id;
    private String naam;
    private String woonplaats;
    private String wachtwoord;
    private String emailadres;

    public void setId(int id) {
        this.id = id;
    }

    public void setEmailadres(String emailadres) {
        this.emailadres = emailadres;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }


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


    public Klant(int id, String naam, String woonplaats, String wachtwoord, String emailadres) {
        this.id = id;
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.wachtwoord = wachtwoord;
        this.emailadres = emailadres;
    }

    @Override
    public String toString() {
        String s = Arrays.deepToString(lijstVanBestellingen.toArray());

        return "\nid: " + id +
                "\nNaam: " + naam +
                "\nWoonplaats: " + woonplaats +
                "\nGemaakte bestellingen:" + s;
    }
}
