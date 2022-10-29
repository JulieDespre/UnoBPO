package uno.cartes.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uno.cartes.*;
import uno.jeu.Uno;


public class TestCartes {
    private Uno uno;

   @BeforeEach
   private void setUp() {
       uno = new Uno();
    }

    @Test
    public void TestPaquet2Cartes() {
        Carte c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Carte c2 = new Chiffre(uno, 7,Couleur.JAUNE);
        PaquetDeCartes monPaquet = new PaquetDeCartes();
        monPaquet.ajouter(c1,c2);
        int test = monPaquet.getNombreDeCartes();
        Assertions.assertTrue(test ==2);
    }
    @Test
    public void Test2Cartes() {
        Carte c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Carte c2 = new Chiffre(uno, 5,Couleur.JAUNE);
        boolean test = c1.peutEtrePoseeSur((Chiffre) c2);
        Assertions.assertTrue(test == true);

    }

    @Test
    public void TestPaquetStandard() {
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetStandard();
        int test = monPaquet.getNombreDeCartes();
        Assertions.assertEquals(108, test);

    }


}