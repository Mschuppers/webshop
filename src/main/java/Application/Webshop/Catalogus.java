package Application.Webshop;

import java.util.ArrayList;

public class Catalogus {

    private int jaartal;
    ArrayList<Artikel> listOfCatalogusArtikelen = new ArrayList<>();


    public Catalogus(int jaartal) {
        this.jaartal = jaartal;
        Artikel a = new Artikel(1, 12.99, "Sleutelhanger");
        Artikel b = new Artikel(2, 22.24, "Webcambeschermer");
        Artikel c = new Artikel(3, 89.33, "Lampenkap deluxe");

        listOfCatalogusArtikelen.add(a);
        listOfCatalogusArtikelen.add(b);
        listOfCatalogusArtikelen.add(c);
    }


    public void voegToeAanCatalogus(Artikel a) {
        listOfCatalogusArtikelen.add(a);
    }

    public String printCatalogus() {
        for (Artikel a : listOfCatalogusArtikelen) {
        }
        return toString();
    }

    @Override
    public String toString() {
        return "\nCatalogus" +
                "jaargang: " + jaartal +
                " \nArtikelen beschikbaar in dit jaar" + listOfCatalogusArtikelen;
    }


}
