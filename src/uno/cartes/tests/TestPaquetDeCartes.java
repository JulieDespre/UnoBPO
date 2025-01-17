package uno.cartes.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uno.cartes.*;
import uno.jeu.Uno;

import java.io.IOException;


public class TestPaquetDeCartes {
    private static Uno uno;

    @BeforeEach
    public void setUp() {
        uno = new Uno();
    }

    @Test
    private static void TestPaquet2Cartes() { //pb avec privae static
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 7,Couleur.JAUNE);
        PaquetDeCartes monPaquet = new PaquetDeCartes();
        monPaquet.ajouter(c1,c2);
        try{monPaquet.ecrire("Paquet2Cartes.txt");}
        catch (ErreurFichier e){System.out.println(e.getMessage());}
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
    public void TestGetNombreDeCartePaqVide() {
        //paquet vide
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetVide();
        int test = monPaquet.getNombreDeCartes();
        Assertions.assertEquals(0, test);
    }

    @Test
    public void TestGetNombreDeCartePac1() {
        // paquet 1 carte
        FabriqueCartes maFabrique2 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet2 = maFabrique2.getPaquet1Vert();
        int test2 = monPaquet2.getNombreDeCartes();
        Assertions.assertEquals(1, test2);
    }

    @Test
    public void TestGetNombreDeCartePac2C() {
        //paquet 2 cartes meme couleur (rouge)
        FabriqueCartes maFabrique3 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet3 = maFabrique3.getPaquet2Chiffre();
        int test3 = monPaquet3.getNombreDeCartes();
        Assertions.assertEquals(2, test3);
    }

    @Test
    public void TestGetNombreDeCartePac1Chif() {
        //paquet 2 cartes meme couleur chiffre, plus2 (rouge)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        try{monPaquet4.ecrire("Paquet2CartesDiff.txt");}
        catch (ErreurFichier e){System.out.println(e.getMessage());}
        int test4 = monPaquet4.getNombreDeCartes();
        Assertions.assertEquals(2, test4);
    }

    @Test
    public void TestGetNombreDeCartePacSpeD() {
        //paquet 2 cartes  diff couleur chiffre, plus2 (vert et rouge)
        FabriqueCartes maFabrique5 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet5 = maFabrique5.getPaquet2DiffCoul();
        int test5 = monPaquet5.getNombreDeCartes();
        Assertions.assertEquals(2, test5);
    }

    @Test
    public void TestGetNombreDeCartePacJok() {
        //paquet 2 cartes  diff couleur chiffre, Joker)
        FabriqueCartes maFabrique6 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet6 = maFabrique6.getPaquet2CoulSpe();
        int test6 = monPaquet6.getNombreDeCartes();
        Assertions.assertEquals(2, test6);
    }

    @Test
    public void TestGetNombreDeCartePac3C() {
        //paquet 5 cartes meme couleur (verte)
        FabriqueCartes maFabrique7 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet7 = maFabrique7.getPaquet5Vert();
        try{monPaquet7.ecrire("Paquet5CartesDiff.txt");}
        catch (ErreurFichier e){System.out.println(e.getMessage());}
        int test7 = monPaquet7.getNombreDeCartes();
        Assertions.assertEquals(5, test7);
    }

    @Test
    public void TestGetNombreDeCartePac6CDiff() {
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
    }
    @Test
    public void TestGetValeur2() {
        // paquet 1 carte
        FabriqueCartes maFabrique2 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet2 = maFabrique2.getPaquet1Vert();
        int test2 = monPaquet2.getValeur();
        Assertions.assertEquals(1, test2);
    }
    @Test
    public void TestGetValeur3() {
        //paquet 2 cartes meme couleur (rouge)
        FabriqueCartes maFabrique3 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet3 = maFabrique3.getPaquet2Chiffre();
        int test3 = monPaquet3.getValeur();
        Assertions.assertEquals(10, test3);
    }
    @Test
    public void TestGetValeur4() {
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        int test4 = monPaquet4.getValeur();
        Assertions.assertEquals(25, test4);
    }
    @Test
    public void TestGetValeur5() {
        //paquet 2 cartes  diff couleur chiffre, plus2 (vert et rouge)
        FabriqueCartes maFabrique5 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet5 = maFabrique5.getPaquet2DiffCoul();
        int test5 = monPaquet5.getValeur();
        Assertions.assertEquals(25, test5);
    }
    @Test
    public void TestGetValeur6() {
        //paquet 2 cartes  diff couleur chiffre, Joker)
        FabriqueCartes maFabrique6 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet6 = maFabrique6.getPaquet2CoulSpe();
        int test6 = monPaquet6.getValeur();
        Assertions.assertEquals(55, test6);
    }
    @Test
    public void TestGetValeur7() {
        //paquet 5 cartes meme couleur (verte)
        FabriqueCartes maFabrique7 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet7 = maFabrique7.getPaquet5Vert();
        int test7 = monPaquet7.getValeur();
        Assertions.assertEquals(15, test7);
    }
    @Test
    public void TestGetValeur8() {
        //paquet de 6 cartes
        FabriqueCartes maFabrique1 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet1 = maFabrique1.getPaquet6();
        int test1 = monPaquet1.getValeur();
        Assertions.assertEquals(108, test1);
    }
    @Test
    public void TestGetValeur9() {
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
    }
    @Test
    public void TestAjouter2() {
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        Chiffre c2 = new Chiffre(uno, 8, Couleur.ROUGE);
        monPaquet4.ajouter(c2);
        System.out.println(monPaquet4);
        int test4 = monPaquet4.getNombreDeCartes();
        Assertions.assertEquals(3, test4);
    }
    @Test
    public void TestAjouter3() {
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique5 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet5 = maFabrique5.getPaquet2Diff();
        Joker c3 = new Joker(uno, 50, Couleur.NOIR);
        monPaquet5.ajouter(c3);
        int test5 = monPaquet5.getNombreDeCartes();
        Assertions.assertEquals(3, test5);
    }
    @Test
    public void TestAjouter4() {
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
    }
    @Test
    public void TestAjouterPDC2() {
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
    }
    @Test
    public void TestEstVide2() { //boolean EstVide()
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
        //a vérifier
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        monPaquet4.piocher();
        Carte test4 = monPaquet4.getSommet();
        Chiffre c1= new Chiffre (uno, 5, Couleur.VERT);
        Assertions.assertEquals(c1.toString(), test4.toString());
    }
    @Test
    //Carte piocher() ne marche pas
    public void TestEnlever() {
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet2Diff();
        Chiffre c1 = new Chiffre (uno, 5, Couleur.VERT);
        monPaquet4.enlever(c1);
        int test4 = monPaquet4.getNombreDeCartes();
        Assertions.assertEquals(1, test4);
    }
    @Test
    public void TestEnlever2() { //paquet 6 cartes
        //paquet 2 cartes meme couleur chiffre, plus2 (vert)
        FabriqueCartes maFabrique4 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet4 = maFabrique4.getPaquet6();
        Joker c1 = new Joker (uno, 50, Couleur.NOIR);
        monPaquet4.enlever(c1);
        int test4 = monPaquet4.getNombreDeCartes();
        Assertions.assertEquals(5, test4);
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
        assert (test5 != test4);
    }

        @Test
        public void TestMelanger2() {
        //paquet 6 cartes differentes couleur chiffre, plus2, PTT, Jocker  (vert)
        FabriqueCartes maFabrique2 = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique2.getPaquet6();
        PaquetDeCartes monPaquet5 = maFabrique2.getPaquet6();
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
    }
    @Test
    public void TestRetourner2() {
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
    @Test
    public void TestEquals() { //chiffre
        Chiffre c1 = new Chiffre(uno, 5, Couleur.JAUNE);
        Chiffre c2 = new Chiffre(uno, 5, Couleur.JAUNE);
        boolean test = c1.equals(c2);
        assert (test);
    }
    @Test
    public void TestEquals1() { //changement de sens
        ChangementDeSens c1 = new ChangementDeSens(uno, 20, Couleur.JAUNE);
        ChangementDeSens c2 = new ChangementDeSens(uno, 20, Couleur.JAUNE);
        boolean test = c1.equals(c2);
        assert (test);
    }
    @Test
    public void TestEquals2() { //Joker
        Joker c1 = new Joker(uno, 50, Couleur.NOIR);
        Joker c2 = new Joker(uno, 50, Couleur.NOIR);
        boolean test = c1.equals(c2);
        assert (test);
    }
    @Test
    public void TestEquals3() { //Passe ton tour
        PasseTonTour c1 = new PasseTonTour(uno, 20, Couleur.JAUNE);
        PasseTonTour c2 = new PasseTonTour(uno, 20, Couleur.JAUNE);
        boolean test = c1.equals(c2);
        assert (test);
    }
    @Test
    public void TestNotEquals() { //test not equals
        PasseTonTour c1 = new PasseTonTour(uno, 20, Couleur.JAUNE);
        Joker c2 = new Joker(uno, 50, Couleur.NOIR);
        boolean test = c1.equals(c2);
        assert (!test);
    }

    @Test
    public void TestNotEqualsChiffre() { //test not equals
        Chiffre c1 = new Chiffre(uno, 5, Couleur.JAUNE);
        Chiffre c2 = new Chiffre(uno, 8, Couleur.JAUNE);
        boolean test = c1.equals(c2);
        assert (!test);
    }

    @Test
    public void TestNotEqualsCouleur() { //test not equals
        Chiffre c1 = new Chiffre(uno, 5, Couleur.JAUNE);
        Chiffre c2 = new Chiffre(uno, 5, Couleur.ROUGE);
        boolean test = c1.equals(c2);
        assert (!test);
    }
    @Test
    public void testEcrire() {
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetStandard();
        try {monPaquet.ecrire("paquetStandard.txt");}
        catch (ErreurFichier e){System.out.println(e.getMessage());}
    }

    @Test
    public void testLire2Chiffres() {
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetVide();
        try {monPaquet.lire("Paquet2Cartes.txt");}
        catch (ErreurFichier e){System.out.println(e.getMessage());}
    }
    @Test
    public void testLire2CartesDiff() {
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetVide();
        try {monPaquet.lire("Paquet5CartesDiff.txt");}
        catch (ErreurFichier e){System.out.println(e.getMessage());}
    }
    @Test
    public void testLirePaquetStandard() {
        FabriqueCartes maFabrique = FabriqueCartes.getFabrique();
        PaquetDeCartes monPaquet = maFabrique.getPaquetVide();
        try {monPaquet.lire("paquetStandard.txt");}
        catch (ErreurFichier e){System.out.println(e.getMessage());}
    }

}

