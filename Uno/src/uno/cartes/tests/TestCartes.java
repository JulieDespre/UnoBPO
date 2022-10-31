package uno.cartes.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uno.cartes.*;
import uno.jeu.Uno;


public class TestCartes {
    private Uno uno;

   @BeforeEach
   public void setUp() {
       uno = new Uno();
    }

    @Test
    public void TestPaquet2Cartes() {
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 7,Couleur.JAUNE);
        PaquetDeCartes monPaquet = new PaquetDeCartes();
        monPaquet.ajouter(c1,c2);
        int test = monPaquet.getNombreDeCartes();
        Assertions.assertEquals(2, test);
    }


}