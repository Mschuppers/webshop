package Application.Webshop;
import java.util.Date;
import java.util.ArrayList;

public class Bestelling {

    private Date besteldatum;
    private double totaalBedrag;

    public ArrayList<Artikel> lijstVanBesteldeArtikelen = new ArrayList<>();


    public Bestelling(Date besteldatum, double totaalBedrag) {
        this.besteldatum = besteldatum;
        this.totaalBedrag = totaalBedrag;
    }

    public void voegArtikelToe(Artikel a){
        lijstVanBesteldeArtikelen.add(a);
    }
}
