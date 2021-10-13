package Application.Webshop;

import java.util.ArrayList;
import java.util.Arrays;

public class Klant {

    private String naam;
    private String woonplaats;

    ArrayList<Bestelling> lijstVanBestellingen = new ArrayList<>();

    public void voegAanBestelGeschiedenisToe(Bestelling a) {
        lijstVanBestellingen.add(a);

    }


    public Klant(String naam, String woonplaats) {
        this.naam = naam;
        this.woonplaats = woonplaats;
    }

    @Override
    public String toString() {
        String s = Arrays.deepToString(lijstVanBestellingen.toArray());

        return "\nKlantdetails" +
                "\nNaam: '" + naam  +
                "\nWoonplaats: '" + woonplaats +
                "\nGemaakte bestellingen: \n" + s;
    }
}
