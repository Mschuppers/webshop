package Application.Webshop;

public class Artikel {
    private int id;
    private double prijs;
    private String omschrijving;

    public int getId() {
        return id;
    }

    public double getPrijs() {
        return prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public Artikel(int id, double prijs, String omschrijving) {
        this.id = id;
        this.prijs = prijs;
        this.omschrijving = omschrijving;
    }
}
