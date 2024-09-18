import java.util.ArrayList;

/**
 * Luokka mallintaa tallennettuja muistiinpanoja muistivihkoon
 * 
 * @author Erkki
 */
public class Muistivihko {
    private String nimi;
    private String omistaja;
    private ArrayList<String> muistiinpanot;

    /**
     * Muodosta olion uuden muistivihko-olion
     * 
     * @param nimi muistivihkon nimi
     * @param omistaja muistivihkon omistajan nimi
     * @param muistiinpanot muistivihkoon lisätyt muistiinpanot
     */
    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }

    /**
     * Palauttaa jo asetetun nimen.
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Asettaa muistiinpanolle nimen.
     * 
     * Asetettavien muistiinpanojen nimi ei voi olla sama kuin aiemmin asetetun.
     * 
     * @param nimi uuden muistiinpanon otsikko
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
     * Palauttaa jo asetetun omistajan.
     */
    public String getOmistaja() {
        return omistaja;
    }

    /**
     * Asettaa muistiinpanolle omistajan.
     * 
     * @param omistaja muistiinpanon omistaja
     */
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    /**
     * Lisää muistivihkoon uuden muistiinpanon
     * @param viesti muistiin kirjoitettu teksti
     */
    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }

    /**
     * Metodi kertoo montako muistiinpanoa on.
     */
    public int muistiinpanoja() {
        return muistiinpanot.size();
    }

    /**
     * Metodi tulostaa kaikki muistiinpanot.
     */
    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }
}