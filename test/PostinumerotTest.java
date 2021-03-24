import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class PostinumerotTest {

    @Test
    public void testPorvoonPostinumerotLoytyvatMapista() {
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
