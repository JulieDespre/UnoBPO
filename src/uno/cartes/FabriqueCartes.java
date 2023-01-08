package uno.cartes;

import uno.jeu.Uno;

public class FabriqueCartes {

    private static final FabriqueCartes fabrique = new FabriqueCartes();

    public static FabriqueCartes getFabrique() {
        return fabrique;
    }

    public PaquetDeCartes getPaquetVide() {
        return new PaquetDeCartes();
    }

    //public PaquetDeCartes getPaquet1Vert() {
    //PaquetDeCartes paquet1 = new PaquetDeCartes ();
    //Random g = new Random();
    //Carte carte1 = new Carte(g.nextInt(8)+1, Couleur.VERT);
    //paquet1.ajouter(carte1);
    //return paquet1;
    //}

    public PaquetDeCartes getPaquet1Vert() {
        Uno uno = new Uno();
        PaquetDeCartes paquet1 = new PaquetDeCartes();
        Chiffre carte1 = new Chiffre(uno, 1, Couleur.VERT);
        paquet1.ajouter(carte1);
        return paquet1;
    }

    public PaquetDeCartes getPaquet2Chiffre() {
        Uno uno = new Uno();
        PaquetDeCartes paquet2 = new PaquetDeCartes();
        Chiffre carte3 = new Chiffre(uno, 5, Couleur.VERT);
        paquet2.ajouter(carte3);
        Chiffre carte4 = new Chiffre(uno, 5, Couleur.ROUGE);
        paquet2.ajouter(carte4);
        return paquet2;
    }

    public PaquetDeCartes getPaquet2ChiffreC() {
        Uno uno = new Uno();
        PaquetDeCartes paquet3 = new PaquetDeCartes();
        Chiffre carte5 = new Chiffre(uno, 5, Couleur.VERT);
        paquet3.ajouter(carte5);
        Chiffre carte6 = new Chiffre(uno, 6, Couleur.ROUGE);
        paquet3.ajouter(carte6);
        return paquet3;
    }
    public PaquetDeCartes getPaquet2Diff() {
        Uno uno = new Uno();
        PaquetDeCartes paquet4 = new PaquetDeCartes();
        Chiffre carte7 = new Chiffre(uno, 5, Couleur.VERT);
        paquet4.ajouter(carte7);
        Plus2 carte8 = new Plus2 (uno, 20, Couleur.VERT);
        paquet4.ajouter(carte8);
        return paquet4;
    }

    public PaquetDeCartes getPaquet2DiffCoul() {
        Uno uno = new Uno();
        PaquetDeCartes paquet5 = new PaquetDeCartes();
        Chiffre carte9 = new Chiffre(uno, 5, Couleur.VERT);
        paquet5.ajouter(carte9);
        Plus2 carte10 = new Plus2 (uno, 20, Couleur.ROUGE);
        paquet5.ajouter(carte10);
        return paquet5;
    }
    public PaquetDeCartes getPaquet2CoulSpe() {
        Uno uno = new Uno();
        PaquetDeCartes paquet1 = new PaquetDeCartes();
        Chiffre carte1 = new Chiffre(uno, 5, Couleur.VERT);
        paquet1.ajouter(carte1);
        Joker carte2 = new Joker (uno, 50, Couleur.NOIR);
        paquet1.ajouter(carte2);
        return paquet1;
    }

    //public PaquetDeCartes getPaquet5Vert() {
    //PaquetDeCartes paquet2 = new PaquetDeCartes ();
    //for (int i=0; i<5; i++) {
    //Random g = new Random();
    //Carte cartei = new Carte(g.nextInt(8)+1, Couleur.VERT);
    //paquet2.ajouter(cartei);
    //}
    //return paquet2;
    //}
    public PaquetDeCartes getPaquet3Rouge() {
        Uno uno = new Uno ();
        PaquetDeCartes paquet4 = new PaquetDeCartes ();
        Chiffre carte1 = new Chiffre (uno, 5, Couleur.ROUGE);
        paquet4.ajouter(carte1);
        Chiffre carte2 = new Chiffre (uno, 9, Couleur.ROUGE);
        paquet4.ajouter(carte2);
        Chiffre carte3 = new Chiffre (uno, 1, Couleur.ROUGE);
        paquet4.ajouter(carte3);
        return paquet4;
    }

    public PaquetDeCartes getPaquet5Vert() {
        Uno uno = new Uno ();
        PaquetDeCartes paquet2 = new PaquetDeCartes ();
        for (int i=0; i<5; i++) {
            Chiffre cartei = new Chiffre (uno, i+1, Couleur.VERT);
            paquet2.ajouter(cartei);
        }
        return paquet2;
    }


    public PaquetDeCartes getPaquet6() {
        Uno uno = new Uno ();
        PaquetDeCartes paquet3 = new PaquetDeCartes ();
        Chiffre carte1 = new Chiffre (uno, 6, Couleur.VERT);
        paquet3.ajouter(carte1);
        PasseTonTour carte2 = new PasseTonTour(uno, 20, Couleur.ROUGE);
        paquet3.ajouter(carte2);
        Plus2 carte3 = new Plus2(uno, 20, Couleur.JAUNE);
        paquet3.ajouter(carte3);
        Chiffre carte4 = new Chiffre (uno, 6, Couleur.ROUGE);
        paquet3.ajouter(carte4);
        Chiffre carte5 = new Chiffre (uno, 6, Couleur.JAUNE);
        paquet3.ajouter(carte5);
        Joker carte6 = new Joker (uno, 50, Couleur.NOIR);
        paquet3.ajouter(carte6);
        return paquet3;
    }
    public PaquetDeCartes getPaquetStandard() {
        Uno uno = new Uno ();
        return getPaquetStandard(uno);
    }

    public PaquetDeCartes getPaquetStandard(Uno uno) {
        PaquetDeCartes paquetStandard = new PaquetDeCartes ();
        //cartes vertes
        //creation zéro
        Chiffre carteZeroV = new Chiffre (uno, 0, Couleur.VERT);
        paquetStandard.ajouter(carteZeroV);
        //création des cartes numéros
        for (int i=0; i<9; i++) {
            Chiffre carte1 = new Chiffre (uno, i+1, Couleur.VERT);
            Chiffre carte2 = new Chiffre (uno, i+1, Couleur.VERT);
            paquetStandard.ajouter(carte1);
            paquetStandard.ajouter(carte2);
        }
        //changement de sens
        ChangementDeSens carte3 = new ChangementDeSens (uno, 20, Couleur.VERT);
        ChangementDeSens carte4 = new ChangementDeSens (uno, 20, Couleur.VERT);
        paquetStandard.ajouter(carte3);
        paquetStandard.ajouter(carte4);

        //Plus2
        Plus2 carte5 = new Plus2 (uno, 20, Couleur.VERT);
        Plus2 carte6 = new Plus2 (uno, 20, Couleur.VERT);
        paquetStandard.ajouter(carte5);
        paquetStandard.ajouter(carte6);

        //PasseTonTour
        PasseTonTour carte7 = new PasseTonTour (uno, 20, Couleur.VERT);
        PasseTonTour carte8 = new PasseTonTour (uno, 20, Couleur.VERT);
        paquetStandard.ajouter(carte7);
        paquetStandard.ajouter(carte8);

        //cartes rouges
        //creation zéro
        Chiffre carteZeroR = new Chiffre (uno, 0, Couleur.ROUGE);
        paquetStandard.ajouter(carteZeroR);
        //création des cartes numéros
        for (int i=0; i<9; i++) {
            Chiffre carte1 = new Chiffre (uno, i+1, Couleur.ROUGE);
            Chiffre carte2 = new Chiffre (uno, i+1, Couleur.ROUGE);
            paquetStandard.ajouter(carte1);
            paquetStandard.ajouter(carte2);
        }
        //changement de sens
        ChangementDeSens carte9 = new ChangementDeSens (uno, 20, Couleur.ROUGE);
        ChangementDeSens carte10 = new ChangementDeSens (uno, 20, Couleur.ROUGE);
        paquetStandard.ajouter(carte9);
        paquetStandard.ajouter(carte10);

        //Plus2
        Plus2 carte11 = new Plus2 (uno, 20, Couleur.ROUGE);
        Plus2 carte12 = new Plus2 (uno, 20, Couleur.ROUGE);
        paquetStandard.ajouter(carte11);
        paquetStandard.ajouter(carte12);

        //PasseTonTour
        PasseTonTour carte13 = new PasseTonTour (uno, 20, Couleur.ROUGE);
        PasseTonTour carte14 = new PasseTonTour (uno, 20, Couleur.ROUGE);
        paquetStandard.ajouter(carte13);
        paquetStandard.ajouter(carte14);

        //cartes bleues
        //creation zéro
        Chiffre carteZeroB = new Chiffre (uno, 0, Couleur.BLEU);
        paquetStandard.ajouter(carteZeroB);
        //création des cartes numéros
        for (int i=0; i<9; i++) {
            Chiffre carte1 = new Chiffre (uno, i+1, Couleur.BLEU);
            Chiffre carte2 = new Chiffre (uno, i+1, Couleur.BLEU);
            paquetStandard.ajouter(carte1);
            paquetStandard.ajouter(carte2);
        }
        //changement de sens
        ChangementDeSens carte15 = new ChangementDeSens (uno, 20, Couleur.BLEU);
        ChangementDeSens carte16 = new ChangementDeSens (uno, 20, Couleur.BLEU);
        paquetStandard.ajouter(carte15);
        paquetStandard.ajouter(carte16);

        //Plus2
        Plus2 carte17 = new Plus2 (uno, 20, Couleur.BLEU);
        Plus2 carte18 = new Plus2 (uno, 20, Couleur.BLEU);
        paquetStandard.ajouter(carte17);
        paquetStandard.ajouter(carte18);

        //PasseTonTour
        PasseTonTour carte19 = new PasseTonTour (uno, 20, Couleur.BLEU);
        PasseTonTour carte20 = new PasseTonTour (uno, 20, Couleur.BLEU);
        paquetStandard.ajouter(carte19);
        paquetStandard.ajouter(carte20);

        //cartes jaunes
        //creation zéro
        Chiffre carteZeroJ = new Chiffre (uno, 0, Couleur.JAUNE);
        paquetStandard.ajouter(carteZeroJ);
        //création des cartes numéros
        for (int i=0; i<9; i++) {
            Chiffre carte1 = new Chiffre (uno, i+1, Couleur.JAUNE);
            Chiffre carte2 = new Chiffre (uno, i+1, Couleur.JAUNE);
            paquetStandard.ajouter(carte1);
            paquetStandard.ajouter(carte2);
        }
        //changement de sens
        ChangementDeSens carte21 = new ChangementDeSens (uno, 20, Couleur.JAUNE);
        ChangementDeSens carte22 = new ChangementDeSens (uno, 20, Couleur.JAUNE);
        paquetStandard.ajouter(carte21);
        paquetStandard.ajouter(carte22);

        //Plus2
        Plus2 carte23 = new Plus2 (uno, 20, Couleur.JAUNE);
        Plus2 carte24 = new Plus2 (uno, 20, Couleur.JAUNE);
        paquetStandard.ajouter(carte23);
        paquetStandard.ajouter(carte24);

        //PasseTonTour
        PasseTonTour carte25 = new PasseTonTour (uno, 20, Couleur.JAUNE);
        PasseTonTour carte26 = new PasseTonTour (uno, 20, Couleur.JAUNE);
        paquetStandard.ajouter(carte25);
        paquetStandard.ajouter(carte26);

        //cartes speciales
        //Joker
        Joker carte27 = new Joker (uno, 50, Couleur.NOIR);
        Joker carte28 = new Joker (uno, 50, Couleur.NOIR);
        Joker carte29 = new Joker (uno, 50, Couleur.NOIR);
        Joker carte30 = new Joker (uno, 50, Couleur.NOIR);
        paquetStandard.ajouter(carte27);
        paquetStandard.ajouter(carte28);
        paquetStandard.ajouter(carte29);
        paquetStandard.ajouter(carte30);

        //Plus4
        Plus4 carte31 = new Plus4 (uno, 50, Couleur.NOIR);
        Plus4 carte32 = new Plus4 (uno, 50, Couleur.NOIR);
        Plus4 carte33 = new Plus4 (uno, 50, Couleur.NOIR);
        Plus4 carte34 = new Plus4 (uno, 50, Couleur.NOIR);
        paquetStandard.ajouter(carte31);
        paquetStandard.ajouter(carte32);
        paquetStandard.ajouter(carte33);
        paquetStandard.ajouter(carte34);

        return paquetStandard;
    }


}