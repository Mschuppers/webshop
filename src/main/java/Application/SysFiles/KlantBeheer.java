package Application.SysFiles;

import Application.Webshop.Klant;
import org.apache.log4j.Logger;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class KlantBeheer {
    ArrayList<Klant> lijstVanKlanten = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    int loggedInAs;
    private final Logger logger = Logger.getLogger(this.getClass());

    public void defaultInitialisation() {
        Klant administrator = new Klant(0, "admin", "admin", 0, "admin", "admin", 2);
        Klant maker = new Klant(1, "Marco", "IJmuiden", 0, "m", "m", 1);

        lijstVanKlanten.add(administrator);
        lijstVanKlanten.add(maker);
    }


    public void registreerNieuweKlant() {
        Klant k = new Klant(lijstVanKlanten.size() + 1, "", "", 0, " ", "", 1);
        System.out.println("Geef een voornaam op");
        k.setNaam(sc.nextLine());
        System.out.println("Geef een woonplaats op");
        k.setWoonplaats(sc.next());
        System.out.println("Kies een bezorgoptie op" +
                "\n1) Afhalen bij huis" +
                "\n2) Bezorgen" +
                "\n3) Magazijn");
        k.setBezorgmethode(sc.nextInt());
        if (k.getBezorgmethode() == 1) {
            System.out.println("Geef de straatnaam en huisnummer op");
            k.setStraatnaamHuisnummer(sc.nextLine());
            System.out.println("Geef de postcode op");
            k.setPostcode(sc.nextLine());
            logger.info(MessageFormat.format("Gebruiker selecteerde optie {1} bezorgen", 1));
        }
        System.out.println("Geef een Wachtwoord op");
        k.setWachtwoord(sc.next());
        System.out.println("Geef een Emailadres op");
        k.setEmailadres(sc.next());
        lijstVanKlanten.add(k);
        logger.info(MessageFormat.format("Usercreated id: {0} name {1}, woonplaats {2}, emailadres {3}, rol {4}.",
                k.getId(), k.getNaam(), k.getWoonplaats(), k.getEmailadres(), k.getIsBeheerder()));
    }

    public void registreerNieuweBeheerder() {
        registreerNieuweKlant();
    }


    public String toonAlleKlanten() {
        String s = "Alle klanten bekend bij ons \n";
        return s + this;
    }

    public int logKlantIn(String emailadres, String wachtwoord) {
        int counter = 0;
        counter +=1;
        for (Klant a : lijstVanKlanten) {
            if (emailadres.equals(a.getEmailadres()) && wachtwoord.equals(a.getWachtwoord())) {
                if (a.getIsBeheerder() == 2) {
                    this.loggedInAs = 2;
                    logger.info(MessageFormat.format("Beheerder log in",loggedInAs));
                } else {
                    this.loggedInAs = 1;
                    logger.info(MessageFormat.format("Gebruiker log in",loggedInAs));
                }
                return loggedInAs;
            }
        }

        logger.error(MessageFormat.format("Verkeerde login poging: {1}",counter));

        return loggedInAs;
    }

    public void verwijderKlant() {
        System.out.println("Welk ID verwijderen?");
        int i = sc.nextInt();
        lijstVanKlanten.removeIf(a -> i == a.getId());
        logger.info(MessageFormat.format("Beheerder verwijderde id {1} ", i));
    }


    @Override
    public String toString() {

        return Arrays.deepToString(lijstVanKlanten.toArray());
    }
}
