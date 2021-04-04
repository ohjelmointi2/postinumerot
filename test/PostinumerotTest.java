import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PostinumerotTest {

    @Test
    public void mapinAvaimetOvatPostinumeroita() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        Set<String> avaimet = postinumeroMap.keySet();

        assertTrue(avaimet.contains("00100"));
        assertTrue(avaimet.contains("00730"));
    }

    @Test
    public void mapinArvotOvatToimipaikkoja() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        Collection<String> arvot = postinumeroMap.values();

        assertTrue(arvot.contains("Helsinki"));
        assertTrue(arvot.contains("Espoo"));
        assertTrue(arvot.contains("Vantaa"));
    }

    @Test
    public void mapinArvotVoidaanHakeaAvaintenAvulla() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        String toimipaikka = postinumeroMap.get("00100");

        assertEquals("Helsinki", toimipaikka);
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
