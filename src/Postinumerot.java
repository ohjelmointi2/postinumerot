import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Postinumerot {

    public static void main(String[] args) {
        Map<String, String> postinumeroMap = luePostinumerot();

        System.out.print("Syötä postitoimipaikka: ");

        /*
         * TODO: Lue käyttäjän syöttämä postitoimipaikan nimi ja tulosta kaikki
         * postinumerot, jotka kuuluvat kyseiseen postitoimipaikkaan.
         * 
         * Tulosteessa postinumeroiden tulee olla kasvavassa järjestyksessä pilkuilla
         * eroteltuna, joten kerää postinumerot ensin listalle, jonka järjestät ennen
         * tulostamista.
         * 
         * Mikäli annetulle postitoimipaikalle ei löydy lainkaan postinumeroita, tulosta
         * "Postinumeroita ei löytynyt."
         */
    }

    /**
     * Lukee postinumeroaineiston tiedostosta postinumerot.csv ja palauttaa
     * tiedoston sisällön Map-tietorakenteena.
     * 
     * Palautetussa Mapissa avaimina toimivat postinumerot ja arvoina toimivat
     * postitoimipaikkojen nimet. Sekä avaimien että arvojen tietotyyppi on String.
     * 
     * @return postinumerot ja -toimipaikat Map-tietorakenteena
     */
    public static Map<String, String> luePostinumerot() {
        Map<String, String> postinumerot = new HashMap<String, String>();

        try {
            Path polku = Paths.get("postinumerot.csv");
            List<String> rivit = Files.readAllLines(polku, StandardCharsets.UTF_8);

            for (int i = 1; i < rivit.size(); i++) {
                String[] rivinOsat = rivit.get(i).split(",");
                String postinumero = rivinOsat[0];
                String postitoimipaikka = rivinOsat[1];

                postinumerot.put(postinumero, postitoimipaikka);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return postinumerot;
    }
}
