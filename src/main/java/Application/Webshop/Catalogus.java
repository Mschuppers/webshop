package Application.Webshop;

import java.util.ArrayList;

public class Catalogus {

    private int jaartal;
    ArrayList<Artikel> listOfCatalogusArtikelen = new ArrayList<>();

    public Catalogus(int jaartal) {
        this.jaartal = jaartal;
    }

    public void voegToeAanCatalogus(Artikel a){
            listOfCatalogusArtikelen.add(a);
    }

    public void printCatalogus(){
        for (Artikel a:listOfCatalogusArtikelen) {
            System.out.println(toString(a));
        }

    }

    public String toString(Artikel a) {
        return "Catalogus{"+ a.getId()+" " +a.getPrijs() + " "+ a.getOmschrijving()+"}";
    }
}
