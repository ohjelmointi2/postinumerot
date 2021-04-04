import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PostitoimipaikkaTest {

    @Test
    public void mapinAvaimetOvatPostinumeroita() {
        Map<String, String> postinumeroMap = Postitoimipaikka.luePostinumerot();

        Set<String> avaimet = postinumeroMap.keySet();

        assertTrue(avaimet.contains("00100"));
        assertTrue(avaimet.contains("00730"));
    }

    @Test
    public void mapinArvotOvatToimipaikkoja() {
        Map<String, String> postinumeroMap = Postitoimipaikka.luePostinumerot();

        Collection<String> arvot = postinumeroMap.values();

        assertTrue(arvot.contains("Helsinki"));
        assertTrue(arvot.contains("Espoo"));
        assertTrue(arvot.contains("Vantaa"));
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
