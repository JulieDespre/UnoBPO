package uno.cartes;

import uno.jeu.Uno;

public class Joker extends Carte {

    public Joker (Uno u, int v, Couleur c){
        super(u, v, c);
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
}
