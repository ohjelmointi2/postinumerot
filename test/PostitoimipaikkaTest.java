import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class PostitoimipaikkaTest {

    @Test
    public void mapinAvaimetOvatPostinumeroita() {
        Map<String, String> postinumeroMap = Postitoimipaikka.luePostinumerot();

        assertTrue(postinumeroMap.containsKey("00100"));
        assertTrue(postinumeroMap.containsKey("00730"));

        assertFalse(postinumeroMap.containsKey("00000"));
    }

    @Test
    public void mapinArvotOvatToimipaikkoja() {
        Map<String, String> postinumeroMap = Postitoimipaikka.luePostinumerot();

        assertTrue(postinumeroMap.containsValue("Helsinki"));
        assertTrue(postinumeroMap.containsValue("Espoo"));
        assertTrue(postinumeroMap.containsValue("Vantaa"));
    }

    @Test
    public void skandimerkitLuetaanTiedostostaOikein() {
        Map<String, String> postinumeroMap = Postitoimipaikka.luePostinumerot();

        String polja = postinumeroMap.get("71820");

        assertEquals("Pöljä", polja);
    }

    @Test
    public void mapinArvotVoidaanHakeaAvaintenAvulla() {
        Map<String, String> postinumeroMap = Postitoimipaikka.luePostinumerot();

        String toimipaikka = postinumeroMap.get("00100");

        assertEquals("Helsinki", toimipaikka);
    }

    @Test
    public void korvatunturinPostinumeroLoytyyMapista() {
        Map<String, String> postinumeroMap = Postitoimipaikka.luePostinumerot();

        assertTrue(postinumeroMap.containsKey("99999"));
        assertEquals("Korvatunturi", postinumeroMap.get("99999"));
    }
}
