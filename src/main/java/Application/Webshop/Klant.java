package Application.Webshop;

public class Klant {

    private String naam;
    private String woonplaats;

    public String getNaam() {
        return naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public Klant(String naam, String woonplaats) {
        this.naam = naam;
        this.woonplaats = woonplaats;
    }


}
