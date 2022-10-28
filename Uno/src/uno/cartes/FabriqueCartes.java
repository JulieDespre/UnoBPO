package uno.cartes;

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
        PaquetDeCartes paquet1 = new PaquetDeCartes ();
        Carte carte1 = new Chiffre(1, Couleur.VERT);
        paquet1.ajouter(carte1);
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

    public PaquetDeCartes getPaquet5Vert() {
        PaquetDeCartes paquet2 = new PaquetDeCartes ();
        for (int i=0; i<5; i++) {
            Carte cartei = new Chiffre(i+1, Couleur.VERT);
            paquet2.ajouter(cartei);
        }
        return paquet2;
    }



}