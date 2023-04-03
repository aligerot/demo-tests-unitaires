import fr.diginamic.immobilier.entites.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testeurImmobilier {
    Maison maison= new Maison();
    @Test
    public void testMaison(){
        maison.ajouterPiece(new Salon(1,34.0));
        assertEquals(maison.calculerSurface(),34,0.001);//on travail avec des Double, le troisimee argument signfie "a plus ou moins 0.001 près"

    }
    @Test
    public void testSuperfType(){
        maison.ajouterPiece(new Salon(1,20));
        maison.ajouterPiece(new Salon(1,34));
        maison.ajouterPiece(new WC(2,2));
        maison.ajouterPiece(new WC(0,4));
        maison.ajouterPiece(new Chambre(1,20));
        maison.ajouterPiece(new Chambre(1,20));
        assertEquals(maison.superficieTypePiece("Salon"),54.0,0.001);
    }


    @Test
    public void testSuperfEtage(){
        maison.ajouterPiece(new Salon(1,20));
        maison.ajouterPiece(new Salon(1,34));
        maison.ajouterPiece(new WC(2,2));
        maison.ajouterPiece(new WC(0,4));
        maison.ajouterPiece(new Chambre(1,20));
        maison.ajouterPiece(new Chambre(1,20));
        assertEquals(maison.superficieEtage(0),4,0.001);

    }
}
