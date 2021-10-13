package Application.Webshop;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bestelling {


    private LocalDate besteldatum;
    private double totaalBedrag;

    public ArrayList<Artikel> lijstVanBesteldeArtikelen = new ArrayList<>();

    public LocalDate getBesteldatum() {
        return besteldatum;
    }

    public double getTotaalBedrag() {

        return totaalBedrag;
    }

    public Bestelling() {
        this.besteldatum = LocalDate.now();
        this.totaalBedrag = 0;
    }

    public void voegToeAanBestelling(Artikel a) {
        lijstVanBesteldeArtikelen.add(a);
    }

    public String berekenTotaal() {
        for (Artikel a : lijstVanBesteldeArtikelen) {
            totaalBedrag += a.getPrijs();
        }

        return toString();
    }


    @Override
    public String toString() {
        return "Bestelling op {" + this.getBesteldatum()+ " voor een totaal van " + this.totaalBedrag +"}";
    }
}
