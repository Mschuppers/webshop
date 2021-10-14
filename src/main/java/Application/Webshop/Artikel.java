package Application.Webshop;

public class Artikel {
    private int id;
    private double prijs;
    private String omschrijving;

    public double getPrijs() {
        return prijs;
    }

    public Artikel(int id, double prijs, String omschrijving) {
        this.id = id;
        this.prijs = prijs;
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "\nArtikel" +
                "id= " + id +
                ", prijs: " + prijs +"€"+
                ", omschrijving:'" + omschrijving;
    }
}
