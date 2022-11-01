package uno.cartes;

import uno.jeu.Uno;

public class Joker extends Carte {

    public Joker (Uno u, int v, Couleur c){
        super(u, v, c);
        assert v == 50 : "la valeur de la carte Joker n'est pas bonne";
        assert c == Couleur.NOIR : "la couleur de la carte Joker n'est pas bonne";
    }

    @Override
    public void appliquerEffet() {

    }

    @Override
    public boolean peutEtreRecouvertPar(Carte c) {
        return c.peutEtrePoseeSur(this);
    }

    @Override
    public boolean peutEtrePoseeSur(Chiffre c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(Plus2 c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(Plus4 c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(Joker c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(ChangementDeSens c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(PasseTonTour c) {
        return true;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Joker) {
           return true;
        } else {
            return false;
        }
    }
}
