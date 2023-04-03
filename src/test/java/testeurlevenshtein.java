import org.junit.Test;

import static fr.diginamic.utils.StringUtils.levenshteinDistance;
import static org.junit.Assert.assertEquals;

public class testeurlevenshtein{
    @Test
    public void levenshtein(){
        int distance = levenshteinDistance("chat","chats");
        assertEquals(distance,1);
    }
    @Test
    public void levenshtein2(){
        int distance = levenshteinDistance("chine","chien");
        assertEquals(distance,2);
    }
    @Test
    public void levenshteinNull(){
        int distance = levenshteinDistance("","chien");
        assertEquals(distance,5);
    }

}
