package uno.cartes.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uno.cartes.Carte;
import uno.cartes.Couleur;
import uno.cartes.PaquetDeCartes;
import uno.cartes.FabriqueCartes;
import uno.jeu.Uno;

import static org.junit.jupiter.api.Assertions.*;

public class TestCartes {
    private Uno uno;

    @BeforeEach
    private void setUp() {
        uno = new Uno();
    }

    @Test
   private static void TestPaquet2Cartes() {
        Carte c1 = new Carte(5, Couleur.ROUGE);
        Carte c2 = new Carte(7, Couleur.JAUNE);
        PaquetDeCartes monPaquet = new PaquetDeCartes();
        monPaquet.ajouter(c1,c2);
        int test = monPaquet.getNombreDeCartes();
        assertTrue(test ==2);


    }


}