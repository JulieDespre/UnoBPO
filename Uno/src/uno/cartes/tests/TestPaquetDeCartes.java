package uno.cartes.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uno.cartes.*;
import uno.jeu.Uno;


public class TestPaquetDeCartes {
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
    @Test
    public void Test2Cartes() {
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 5,Couleur.JAUNE);
        boolean test = c1.peutEtrePoseeSur(c2);
        Assertions.assertTrue(test);
    }
    @Test
    public void TestPaquetStandard() {
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetStandard();
        int test = monPaquet.getNombreDeCartes();
        Assertions.assertEquals(108, test);

    }
    @Test
    public void TestGetNombreDeCarte() {
        //paquet vide
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetVide();
        int test = monPaquet.getNombreDeCartes();
        Assertions.assertEquals(0, test);
        // paquet 1 carte
        FabriqueCartes maFabrique2 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet2 = maFabrique2.getPaquet1Vert();
        int test2 = monPaquet2.getNombreDeCartes();
        Assertions.assertEquals(1, test2);
        //paquet 2 cartes meme couleur (rouge)
        FabriqueCartes maFabrique3 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet3 = maFabrique3.getPaquet2Chiffre();
        int test3= monPaquet3.getNombreDeCartes();
        Assertions.assertEquals(2, test3);
        //paquet 2 cartes meme couleur chiffre, plus2 (rouge)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        int test4= monPaquet4.getNombreDeCartes();
        Assertions.assertEquals(2, test4);
        //paquet 2 cartes  diff couleur chiffre, plus2 (vert et rouge)
        FabriqueCartes maFabrique5 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet5 = maFabrique5.getPaquet2DiffCoul();
        int test5= monPaquet5.getNombreDeCartes();
        Assertions.assertEquals(2, test5);
        //paquet 2 cartes  diff couleur chiffre, Joker)
        FabriqueCartes maFabrique6 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet6 = maFabrique6.getPaquet2CoulSpe();
        int test6= monPaquet6.getNombreDeCartes();
        Assertions.assertEquals(2, test6);
        //paquet 5 cartes meme couleur (verte)
        FabriqueCartes maFabrique7 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet7 = maFabrique7.getPaquet5Vert();
        int test7= monPaquet7.getNombreDeCartes();
        Assertions.assertEquals(5, test7);
        //paquet de 6 cartes
        FabriqueCartes maFabrique1 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet1 = maFabrique1.getPaquet6();
        int test1 = monPaquet1.getNombreDeCartes();
        Assertions.assertEquals(6, test1);

    }
    @Test
    public void TestGetValeur() {
        //paquet vide
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetVide();
        int test = monPaquet.getValeur();
        Assertions.assertEquals(0, test);
        // paquet 1 carte
        FabriqueCartes maFabrique2 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet2 = maFabrique2.getPaquet1Vert();
        int test2 = monPaquet2.getValeur();
        Assertions.assertEquals(1, test2);
        //paquet 2 cartes meme couleur (rouge)
        FabriqueCartes maFabrique3 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet3 = maFabrique3.getPaquet2Chiffre();
        int test3= monPaquet3.getValeur();
        Assertions.assertEquals(10, test3);
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        int test4= monPaquet4.getValeur();
        Assertions.assertEquals(25, test4);
        //paquet 2 cartes  diff couleur chiffre, plus2 (vert et rouge)
        FabriqueCartes maFabrique5 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet5 = maFabrique5.getPaquet2DiffCoul();
        int test5= monPaquet5.getValeur();
        Assertions.assertEquals(25, test5);
        //paquet 2 cartes  diff couleur chiffre, Joker)
        FabriqueCartes maFabrique6 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet6 = maFabrique6.getPaquet2CoulSpe();
        int test6= monPaquet6.getValeur();
        Assertions.assertEquals(55, test6);
        //paquet 5 cartes meme couleur (verte)
        FabriqueCartes maFabrique7 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet7 = maFabrique7.getPaquet5Vert();
        int test7= monPaquet7.getValeur();
        Assertions.assertEquals(15, test7);
        //paquet de 6 cartes
        FabriqueCartes maFabrique1 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet1 = maFabrique1.getPaquet6();
        int test1 = monPaquet1.getValeur();
        Assertions.assertEquals(108, test1);
        //paquet standard
        FabriqueCartes maFabrique8 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet8 = maFabrique8.getPaquetStandard();
        int test8 = monPaquet8.getValeur();
        Assertions.assertEquals(1240, test8);
    }
    @Test
    public void TestAjouter() { //ajouter(Carte... carte)
        //paquet vide
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetVide();
        Chiffre c1 = new Chiffre(uno, 8, Couleur.ROUGE);
        monPaquet.ajouter(c1);
        int test = monPaquet.getNombreDeCartes();
        Assertions.assertEquals(1, test);
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        Chiffre c2 = new Chiffre(uno, 8, Couleur.ROUGE);
        monPaquet4.ajouter(c2);
        int test4 = monPaquet4.getNombreDeCartes();
        Assertions.assertEquals(3, test4);
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique5 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet5 = maFabrique5.getPaquet2Diff();
        Joker c3 = new Joker(uno, 50, Couleur.NOIR);
        monPaquet5.ajouter(c3);
        int test5 = monPaquet5.getNombreDeCartes();
        Assertions.assertEquals(3, test5);
        //paquet 2 cartes  diff couleur chiffre, Joker)
        FabriqueCartes maFabrique6 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet6 = maFabrique6.getPaquet2CoulSpe();
        Plus4 c4 = new Plus4(uno, 50, Couleur.NOIR);
        monPaquet6.ajouter(c4);
        int test6 = monPaquet6.getNombreDeCartes();
        Assertions.assertEquals(3, test6);
        }

    @Test
    public void TestAjouterPDC() { //ajouter(PaquetDeCarte... pdc)
        //ajouter 1 pdc à un paquet de  1 carte
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquet1Vert();
        PaquetDeCartes paquetAdd = maFabrique.getPaquet2Chiffre();
        monPaquet.ajouter(paquetAdd);
        int test = monPaquet.getNombreDeCartes();
        Assertions.assertEquals(3, test);
        //ajouter un pcd à un autre pdc
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        PaquetDeCartes paquetAdd2 = maFabrique4.getPaquet2CoulSpe();
        monPaquet4.ajouter(paquetAdd2);
        int test4 = monPaquet4.getNombreDeCartes();
        Assertions.assertEquals(4, test4);
    }

    @Test
    public void TestEstVide() { //boolean EstVide()
        //paquet vide
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetVide();
        boolean test = monPaquet.estVide();
        Assertions.assertTrue(test);
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        boolean test4 = monPaquet4.estVide();
        Assertions.assertFalse(test4);
    }

    @Test
    public void TestGetSommet() { //Carte piocher()
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        Carte test4 = monPaquet4.getSommet();
        Plus2 c1 = new Plus2 (uno, 20, Couleur.VERT);
        Assertions.assertEquals(c1.toString(), test4.toString());
    }
    @Test
    public void TestPiocher() { //Carte piocher()
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        monPaquet4.piocher();
        Carte test4 = monPaquet4.getSommet();
        Plus2 c1 = new Plus2 (uno, 5, Couleur.VERT);
        Assertions.assertEquals(c1.toString(), test4.toString());
    }
    @Test
    //Carte piocher() ne marche pas
    public void TestEnlever() {
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        System.out.println(monPaquet4);
        Chiffre c1 = new Chiffre (uno, 5, Couleur.VERT);
        monPaquet4.enlever(c1);
        System.out.println(monPaquet4);
        int test4 = monPaquet4.getNombreDeCartes();
        //Assertions.assertEquals(1, test4);
    }

    @Test
    public void TestMelanger() {
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        PaquetDeCartes monPaquet2 = maFabrique4.getPaquet2Diff();
        monPaquet4.melanger();
        String test4 = monPaquet4.toString();
        String test5 = monPaquet2.toString();
        assert(test5 != test4);

        //paquet 6 cartes differentes couleur chiffre, plus2, PTT, Jocker  (vert)
        FabriqueCartes maFabrique2 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique2.getPaquet6();
        PaquetDeCartes monPaquet5 = maFabrique4.getPaquet6();
        monPaquet.melanger();
        String test = monPaquet.toString();
        String test2 = monPaquet5.toString();
        assert(test != test2);
    }
    @Test
    public void TestRetourner() {
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        Carte test4 = monPaquet4.getSommet();
        monPaquet4.retourner();
        Carte test5 = monPaquet4.getSommet();
        assert (test5 != test4);

        //paquet 6 cartes différentes
        FabriqueCartes maFabrique5 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet5 = maFabrique5.getPaquet6();
        int tailleAv = monPaquet5.getNombreDeCartes();
        Carte test6 = monPaquet5.getSommet();
        monPaquet5.retourner();
        Carte test7 = monPaquet5.getSommet();
        int tailleAp = monPaquet5.getNombreDeCartes();
        assert (test7 != test6 && tailleAv == tailleAp);

    }
}

