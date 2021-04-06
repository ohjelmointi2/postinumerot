import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class PostinumerotTest {

    @Test
    public void mapinAvaimetOvatPostinumeroita() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        assertTrue(postinumeroMap.containsKey("00100"));
        assertTrue(postinumeroMap.containsKey("00730"));

        assertFalse(postinumeroMap.containsKey("00000"));
    }

    @Test
    public void mapinArvotOvatToimipaikkoja() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        assertTrue(postinumeroMap.containsValue("Helsinki"));
        assertTrue(postinumeroMap.containsValue("Espoo"));
        assertTrue(postinumeroMap.containsValue("Vantaa"));
    }

    @Test
    public void mapinArvotVoidaanHakeaAvaintenAvulla() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        String toimipaikka = postinumeroMap.get("00100");

        assertEquals("Helsinki", toimipaikka);
    }

    @Test
    public void skandimerkitLuetaanTiedostostaOikein() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        String polja = postinumeroMap.get("71820");

        assertEquals("Pöljä", polja);
    }

    @Test
    public void porvoonPostinumerotLoytyvatMapista() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        assertEquals("Porvoo", postinumeroMap.get("06100"));
        assertEquals("Porvoo", postinumeroMap.get("06101"));
        assertEquals("Porvoo", postinumeroMap.get("06150"));
        assertEquals("Porvoo", postinumeroMap.get("06151"));
        assertEquals("Porvoo", postinumeroMap.get("06200"));
        assertEquals("Porvoo", postinumeroMap.get("06400"));
        assertEquals("Porvoo", postinumeroMap.get("06401"));
        assertEquals("Porvoo", postinumeroMap.get("06450"));
        assertEquals("Porvoo", postinumeroMap.get("06500"));
    }

}
