import com.sun.source.tree.AssertTree;
import fr.diginamic.enumerations.Saison;
import org.junit.Test;

import static fr.diginamic.enumerations.Saison.AUTOMNE;
import static fr.diginamic.enumerations.Saison.valueOfLibelle;
import static org.junit.Assert.assertEquals;


public class testeurSaison {
    //non pasant

    @Test
    public void valeurLieblle(){
        Saison saisonTest = valueOfLibelle("AUTOMNE");
        assertEquals(saisonTest,AUTOMNE);
    }
//passant
    @Test
    public void valeurLieblle1(){
        Saison saisonTest = valueOfLibelle("Automne");
        assertEquals(saisonTest,AUTOMNE);
    }
    //non passant
    @Test
    public void valeurLieblle2(){
        Saison saisonTest = valueOfLibelle("Printemps");
        assertEquals(saisonTest,AUTOMNE);
    }

}
