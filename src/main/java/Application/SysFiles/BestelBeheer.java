package Application.SysFiles;

import Application.Webshop.Artikel;
import Application.Webshop.Bestelling;


public class BestelBeheer {
    Bestelling b = new Bestelling();


    public void nieuweBestelling(Artikel a) {
        this.b.voegToeAanBestelling(a);
    }


    public String printBestelOverzicht() {
        return this.b.toString();
    }


}
