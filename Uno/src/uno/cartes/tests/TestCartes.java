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

    //pour chaque type de cartes
    //constructeur
    //peutetreposésur
    //peutEtreREcouvertPar


//test getValeur()
    @Test
    public void TestGetValeurChiffre(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        int test = c1.getValeur();
        Assertions.assertEquals(5, test);
    }

    @Test
    public void TestGetValeurCarteSpe(){
        Plus2 p1 = new Plus2(uno, 20, Couleur.BLEU);
        int test = p1.getValeur();
        Assertions.assertEquals(20, test);
    }

    @Test
    public void TestGetValeurCarteSpe2(){
        PasseTonTour p1 = new PasseTonTour(uno, 20, Couleur.ROUGE);
        int test = p1.getValeur();
        Assertions.assertEquals(20, test);
    }

    @Test
    public void TestGetValeurCarteSpe3(){
        ChangementDeSens c1 = new ChangementDeSens(uno, 20, Couleur.ROUGE);
        int test = c1.getValeur();
        Assertions.assertEquals(20, test);
    }

    @Test
    public void TestGetValeurCarteNoire(){
        Joker j1 = new Joker(uno, 50, Couleur.NOIR);
        int test = j1.getValeur();
        Assertions.assertEquals(50, test);
    }

    @Test
    public void TestGetValeurCarteNoire2(){
        Plus4 p1 = new Plus4(uno, 50, Couleur.NOIR);
        int test = p1.getValeur();
        Assertions.assertEquals(50, test);
    }

    //test getCouleur()
    @Test
    public void TestGetCouleurChiffre(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Couleur test = c1.getCouleur();
        Assertions.assertEquals(Couleur.ROUGE, test);
    }

    @Test
    public void TestGetCouleurCarteSpe(){
        Plus2 p1 = new Plus2(uno, 20, Couleur.BLEU);
        Couleur test = p1.getCouleur();
        Assertions.assertEquals(Couleur.BLEU, test);
    }

    @Test
    public void TestGetCouleurCarteSpe2(){
        PasseTonTour p1 = new PasseTonTour(uno, 20, Couleur.JAUNE);
        Couleur test = p1.getCouleur();
        Assertions.assertEquals(Couleur.JAUNE, test);
    }

    @Test
    public void TestGetCouleurCarteSpe3(){
        ChangementDeSens c1 = new ChangementDeSens(uno, 20, Couleur.ROUGE);
        Couleur test = c1.getCouleur();
        Assertions.assertEquals(Couleur.ROUGE, test);
    }

    @Test
    public void TestGetCouleurCarteNoire(){
        Joker j1 = new Joker(uno, 50, Couleur.NOIR);
        Couleur test = j1.getCouleur();
        Assertions.assertEquals(Couleur.NOIR, test);
    }

    @Test
    public void TestGetCouleurCarteNoire2(){
        Plus4 p1 = new Plus4(uno, 50, Couleur.NOIR);
        Couleur test = p1.getCouleur();
        Assertions.assertEquals(Couleur.NOIR, test);
    }

    @Test
    public void TestconstructionChiffre() {
        int a = 9;
        Couleur c = Couleur.ROUGE;
        Chiffre c1 = new Chiffre (uno, 9, Couleur.ROUGE);
        boolean test = c1.getValeur() == a && c1.getCouleur() == c;
        assert (test);
    }

    @Test
    public void TestconstructionCarteSpe(){
        int a = 20;
        Couleur c = Couleur.BLEU;
        ChangementDeSens c1 = new ChangementDeSens (uno, 20, Couleur.BLEU);
        boolean test = c1.getValeur() == a && c1.getCouleur() == c;
        assert (test);
    }

    @Test
    public void TestconstructionJoker(){
        int a = 50;
        Couleur c = Couleur.NOIR;
        Joker j = new Joker (uno, 50, Couleur.NOIR);
        boolean test = j.getValeur() == a && j.getCouleur() == c;
        assert (test);
    }

    @Test
    public void TestEstSansCouleur(){
        ChangementDeSens c1 = new ChangementDeSens (uno, 20, Couleur.BLEU);
        boolean test = c1.estSansCouleur();
        assert (!test);
    }

    @Test
    public void TestEstSansCouleur2(){
        Joker j = new Joker (uno, 50, Couleur.NOIR);
        boolean test = j.estSansCouleur();
        assert (test);
    }

    @Test
    public void TestEstCompatibleAvecChiffre(){
        Chiffre c1 = new Chiffre (uno, 9, Couleur.ROUGE);
        Chiffre c2 = new Chiffre (uno, 0, Couleur.ROUGE);
        boolean test = c1.estDeCouleurCompatibleAvec(c2);
        assert (test);
    }

    @Test
    public void TestEstCompatibleAvecCarteSpe(){
        ChangementDeSens c1 = new ChangementDeSens (uno, 20, Couleur.ROUGE);
        Plus2 c2 = new Plus2 (uno, 20, Couleur.ROUGE);
        boolean test = c1.estDeCouleurCompatibleAvec(c2);
        assert (test);
    }

    @Test
    public void TestEstCompatibleAvecCarteSpeChiffre(){
        ChangementDeSens c1 = new ChangementDeSens (uno, 20, Couleur.ROUGE);
        Chiffre c2 = new Chiffre (uno, 0, Couleur.ROUGE);
        boolean test = c1.estDeCouleurCompatibleAvec(c2);
        assert (test);
    }

    @Test
    public void TestPeutEtrePoseeSurChiffre(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 9,Couleur.ROUGE);
        boolean test = c2.peutEtrePoseeSur(c1);
        assert (test);
    }

    @Test
    public void TestPeutEtrePoseeSurChiffreNon(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 9,Couleur.BLEU);
        boolean test = c2.peutEtrePoseeSur(c1);
        assert (!test);
    }

    @Test
    public void TestPeutEtrePoseeSurCarteSpeChiffre(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        ChangementDeSens c2 = new ChangementDeSens (uno, 20, Couleur.ROUGE);
        boolean test = c2.peutEtrePoseeSur(c1);
        assert (test);
    }

    @Test
    public void TestPeutEtrePoseeSurCarteSpeChiffreNon(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        ChangementDeSens c2 = new ChangementDeSens (uno, 20, Couleur.VERT);
        boolean test = c2.peutEtrePoseeSur(c1);
        assert (!test);
    }

    @Test
    public void TestPeutEtrePoseeSurCarteNoirSurChiffre(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Joker j = new Joker (uno, 50, Couleur.NOIR);
        boolean test = j.peutEtrePoseeSur(c1);
        assert (test);
    }

    @Test
    public void TestPeutEtrePoseeSurCarteNoirSurCarteSpe(){
        ChangementDeSens c1 = new ChangementDeSens (uno, 20, Couleur.BLEU);
        Joker j = new Joker (uno, 50, Couleur.NOIR);
        boolean test = j.peutEtrePoseeSur(c1);
        assert (test);
    }

    //peut etre recouvert par
    @Test
    public void TestPeutEtreRecouvertParCarteSpeChiffre(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        ChangementDeSens c2 = new ChangementDeSens (uno, 20, Couleur.ROUGE);
        boolean test = c2.peutEtreRecouvertPar(c1);
        assert (test);
    }

    @Test
    public void TestPeutEtreRecouvertParChiffreCarteSpe(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        ChangementDeSens c2 = new ChangementDeSens (uno, 20, Couleur.ROUGE);
        boolean test = c1.peutEtreRecouvertPar(c2);
        assert (test);
    }

    @Test
    public void TestPeutEtreRecouvertParChiffreChiffreVal(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 5,Couleur.BLEU);
        boolean test = c2.peutEtreRecouvertPar(c1);
        assert (test);
    }

    @Test
    public void TestPeutEtreRecouvertParChiffreChiffreCoul(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 0,Couleur.ROUGE);
        boolean test = c2.peutEtreRecouvertPar(c1);
        assert (test);
    }
    @Test
    public void TestPeutEtreRecouvertParChiffreCarteNoire(){
        Plus4 p1 = new Plus4(uno, 50,Couleur.NOIR);
        Chiffre c1 = new Chiffre(uno, 0,Couleur.ROUGE);
        boolean test = c1.peutEtreRecouvertPar(p1);
        assert (test);
    }

    //ne peut pas etre recouvert par
    @Test
    public void TestPeutEtreRecouvertParCarteSpeChiffreNot(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        ChangementDeSens c2 = new ChangementDeSens (uno, 20, Couleur.BLEU);
        boolean test = c2.peutEtreRecouvertPar(c1);
        assert (!test);
    }

    @Test
    public void TestPeutEtreRecouvertParChiffreCarteSpeNot(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        ChangementDeSens c2 = new ChangementDeSens (uno, 20, Couleur.BLEU);
        boolean test = c1.peutEtreRecouvertPar(c2);
        assert (!test);
    }

    @Test
    public void TestPeutEtreRecouvertParChiffreChiffreValNot(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 9,Couleur.BLEU);
        boolean test = c2.peutEtreRecouvertPar(c1);
        assert (!test);
    }

    @Test
    public void TestPeutEtreRecouvertParChiffreChiffreCoulNot(){
        Chiffre c1 = new Chiffre(uno, 5,Couleur.ROUGE);
        Chiffre c2 = new Chiffre(uno, 0,Couleur.VERT);
        boolean test = c2.peutEtreRecouvertPar(c1);
        assert (!test);
    }


}