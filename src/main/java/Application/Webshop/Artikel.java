package Application.Webshop;

public class Artikel {
    private int id;
    private double prijs;
    private String omschrijving;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

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
                "id: " + id +
                ", prijs: " + prijs +"€"+
                ", omschrijving:'" + omschrijving;
    }
}
