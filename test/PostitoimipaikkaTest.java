import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

class PostitoimipaikkaTest {

    @Test
    public void testKorvatunturinPostinumeroLoytyyMapista() {
        Map<String, String> postinumeroMap = Postinumerot.luePostinumerot();

        assertTrue(postinumeroMap.containsKey("99999"));
        assertEquals("Korvatunturi", postinumeroMap.get("99999"));
    }

}
